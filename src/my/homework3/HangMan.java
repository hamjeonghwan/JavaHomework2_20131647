package my.homework3;
import java.util.*;
import java.io.*;

public class HangMan {

	int hiddenChar;
	StringBuffer hiddenWord; 
	String newWord; 
	Scanner scanner;
	int failCount; 
	
	public HangMan(){
		scanner = new Scanner(System.in);
	}
	public void run(){
	      Words words = new Words("C://Users/user/eclipse-workspace/JavaHomework2_20131647/src/my/homework3/행맨.txt");
	      
	      while(true){
	    	  System.out.println("시작");
		      System.out.print("3에서 5까지의 숫자중 하나를 골라주세요.(빈칸수:단어수가 짧으면 랜덤)>>");
		      
		      hiddenChar = scanner.nextInt();
		      if (hiddenChar < 3 || hiddenChar > 7) {
		         System.out.println("3에서 5의 숫자를 입력하세요");
		         return;
		      }
	    	  while(true){
	    		  newWord = words.getRandomWord(); 
	    		  if (newWord.length() <= hiddenChar) 
	                  continue;
	              else
	                  break;
	    	  }
    		  makeHidden();
    		  go();
    		  System.out.print("또? (y/n)");
    		  String answer = scanner.next();
    		  if(answer.equals("n"))
    			  break;
	      }
	  }    
      void makeHidden(){
    	  hiddenWord = new StringBuffer(newWord);
    	  Random ran = new Random();
    	  
    	  for(int i=0; i<hiddenChar; i++){
    		  int index = ran.nextInt(newWord.length());
    		  char c = newWord.charAt(index);
    		  for(int j=0; j<newWord.length(); j++){
    			  if(hiddenWord.charAt(j)==c) 
    				  hiddenWord.setCharAt(j, '-');              
    		  }
    	  }
      }
      void go(){
    	  failCount = 0;
    	  char key;
    	  do{
    		  if(failCount == 5){
    			  System.out.println("실패.");
    			  break;
    		  }
    		  System.out.println(hiddenWord);
    		  System.out.print(">>");
    		  String text = scanner.next();
    		  key = text.charAt(0); 
                  
    	  } while(!complete(key));
    	  
    	  System.out.println("정답 >> "+newWord);
      }
      boolean complete(char key){
    	  boolean hit = false;
    	  for(int i=0; i<newWord.length(); i++){
    		  if(hiddenWord.charAt(i)=='-'&&newWord.charAt(i)==key){
    			  hiddenWord.setCharAt(i, key);
    			  hit = true;
    		  }
    	  }
    	  if(!hit) 
    		  failCount++;
    	 
    	  for(int i=0; i<newWord.length(); i++){
    		  if(hiddenWord.charAt(i) == '-') 
    			  return false; 
    	  }
    	  return true; 
      } 
      public static void main(String[] args) {
          HangMan Game = new HangMan();
          Game.run();
      }
}

class Words{
	final int WORDMAX = 40; // 파일에 들은 단어 개수
	private String fileName;
	private Random ran = new Random();
	
	public Words(String fileName){
		this.fileName = fileName;
	}
	public String getRandomWord(){
		BufferedReader in = null;
		
		try {
			in = new BufferedReader(new FileReader(fileName));
		}
		catch (FileNotFoundException e){
			System.out.println("error");
			System.exit(0); 
		}
		int n = ran.nextInt(WORDMAX); 
		return readWord(in, n); 
	}
	private String readWord(BufferedReader in, int n){
		String line= null; 
		try{
			while(n>0){
				line = in.readLine();
				if(line == null){
					break;
				}
				n--;
			}
		}
		catch (IOException e){
			System.exit(0);
		}
		return line; 
	}
}