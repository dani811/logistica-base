package logistica.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncriptadorUtil {
	
	    //algoritmos
	    public static String MD2 = "MD2";
	    public static String MD5 = "MD5";
	    public static String SHA1 = "SHA-1";
	    public static String SHA256 = "SHA-256";
	    public static String SHA384 = "SHA-384";
	    public static String SHA512 = "SHA-512";

	    /***
	     * Convierte un arreglo de bytes a String usando valores hexadecimales
	     * @param digest arreglo de bytes a convertir
	     * @return String creado a partir de <code>digest</code>
	     */
	    private static String toHexadecimal(byte[] digest){
	        String hash = "";
	        for(byte aux : digest) {
	            int b = aux & 0xff;
	            if (Integer.toHexString(b).length() == 1) hash += "0";
	            hash += Integer.toHexString(b);
	        }
	        return hash;
	    }

	    /***
	     * Encripta un mensaje de texto mediante algoritmo de resumen de mensaje.
	     * @param message texto a encriptar
	     * @param algorithm algoritmo de encriptacion, puede ser: MD2, MD5, SHA-1, SHA-256, SHA-384, SHA-512
	     * @return mensaje encriptado
	     */
	    public static String getStringMessageDigest(String message, String algorithm){
	        byte[] digest = null;
	        byte[] buffer = message.getBytes();
	        try {
	            MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
	            messageDigest.reset();
	            messageDigest.update(buffer);
	            digest = messageDigest.digest();
	        } catch (NoSuchAlgorithmException ex) {
	            System.out.println("Error creando Digest");
	        }
	        return toHexadecimal(digest);
	    }
	    
	    public static void main(String[] args) {
	    	String mensaje = "123456";
	        System.out.println("Mensaje = " + mensaje);
	        System.out.println("MD2 = " + EncriptadorUtil.getStringMessageDigest(mensaje, EncriptadorUtil.MD2));
	        System.out.println("MD5 = " + EncriptadorUtil.getStringMessageDigest(mensaje, EncriptadorUtil.MD5));
	        System.out.println("SHA-1 = " + EncriptadorUtil.getStringMessageDigest(mensaje, EncriptadorUtil.SHA1));
	        System.out.println("SHA-256 = " + EncriptadorUtil.getStringMessageDigest(mensaje, EncriptadorUtil.SHA256));
	        System.out.println("SHA-384 = " + EncriptadorUtil.getStringMessageDigest(mensaje, EncriptadorUtil.SHA384));
	        System.out.println("SHA-512 = " + EncriptadorUtil.getStringMessageDigest(mensaje, EncriptadorUtil.SHA512));
		}
}
