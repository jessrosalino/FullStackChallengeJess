/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda_funcion;

/**
 *
 * @author macbook
 */
import java.security.MessageDigest;
import java.security. NoSuchAlgorithmException;
import java.util.function.Function;

public class HashFunction{

    public static void main(String[] args) {
Function <String, String> hashFunction = (String input){
if (isValidString(input)) {
return computeSHA256 ( input);
return null;
}
};
String inputString = "test_jess"; 
String hashedString = hashFunction.apply(inputString);
if(hashedString != null) {
    System.out .printin( "Hashed string: " + hashedString);
    else{
System.out .println("Invalid input string. The string must have at least 8 characters, at least one number, and at least one special character);
}
}
private static boolean isvalidString(String input) {
if(input. length() < 8) {
return false;
}
if (!input.matches(".\\d.*")) {
return false;
}
if (!input.matches(".*[^a-zA-ZO-9].*")) {
return false;
}
return true;
}
private static String computeSHA256(String input) {
try{
MessageDigest digest = MessageDigest.getInstance("SHA-256");
byte[] hashBytes = digest.digest(input.getBytes());

StringBuilder hexString = new StringBuilder();
for (byte b : hashBytes){
String hex= Integer, toHexString(0xff & b);
if (hex. length() = 1) {
hexString.append('0');
}
hexString. append (hex);
}
return hexString. toString();
} catch (NoSuchAlgorithmException e) {
e.printStackTrace();
}
return null;
}
}