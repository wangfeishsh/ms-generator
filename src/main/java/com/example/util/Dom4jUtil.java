package com.example.util;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

/**
 * Created by user on 16/8/27.
 */
public class Dom4jUtil {
    public static void main(String []args){

        Document document = DocumentHelper.createDocument();

        Element root = document.addElement( "MasMessage" )
//                .addAttribute("xmlns","http://www.99bill.com/mas_cnp_merchant_interface");
                .addNamespace("xmlns","http://www.99bill.com/mas_cnp_merchant_interface");


        Element author1 = root.addElement( "author" )
                .addElement( "test" )
                .addAttribute( "name", "Bob" )
                .addAttribute( "location", "US" )
                .addText( "Bob McWhirter" )
                .addElement( "key" )
                .addAttribute( "name", "Bob" )
                .addAttribute( "location", "US" )
                .addText( "Bob McWhirter" );

        System.out.println(document.asXML());
        System.out.println(document.getRootElement().getName());
        System.out.println(root.asXML());

    }
}
