/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryptar;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/**
 *
 * @author shootface
 */
public class EncriptarSHA extends Encriptar{

    @Override
    public String Encriptar(String texto) {
        String base64EncryptedString = "";
        try {
            MessageDigest md = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_512);
            md.update(texto.getBytes());
            byte[] digest = md.digest();
            
            // Se escribe byte a byte en hexadecimal
            for (byte b : digest) {
                System.out.print(Integer.toHexString(0xFF & b));
            }
            System.out.println();
            
            // Se escribe codificado base 64. Se necesita la librería
            // commons-codec-x.x.x.jar de Apache
            byte[] encoded = Base64.encodeBase64(digest);
            base64EncryptedString=new String(encoded);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(EncriptarSHA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return base64EncryptedString;
    }

    @Override
    public String Desencriptar(String texto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
