public class random {
public static void main(String[] args) {
String[] word1 = {"красивый", "Умный","Добрый"};
String [] word2 = {"man", "dad", "cat"};
String[] word3 = {"son", "body", "dog"};
int one = word1.length;
int two = word2.length;
int three = word3.length;
int rand1 =(int) (Math.random()*one);
int rand2 =(int) (Math.random()*two);
int rand3 =(int) (Math.random()*three);
String phrase = word1[rand1]+ " "+ word2[rand2]+" "+ word3[rand3];
System.out.println (phrase);
}
}