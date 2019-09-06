package com.xiaoleng.java.dom;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DomXMLParseUtil {

    /*
     * 写一个读取树的函数： 1：获得第一层子节点 2：获得子节点的属性 3：完成第一、二步后读取下一层回掉函数重复执行第一、二步后
     */
    private static void readtreestructure(NodeList nodes) {
        // 遍历所有子节点
        for (int i = 0; i < nodes.getLength(); i++) {
            Node item = nodes.item(i);
            // 获得字节点名，判断子节点的类型，区分出text类型的node以及element类型的node
            if (item.getNodeType() == Node.ELEMENT_NODE) {
                String value = ((Text) (item.getFirstChild())).getData().trim();

                if (value.getBytes().length != 0) {
                    //如果有逗号和句号，换行
                    String reg = "[\\,\\，\\。]";
                    Pattern pattern = Pattern.compile(reg);
                    Matcher matcher = pattern.matcher(value);
                    System.out.println(matcher.replaceAll("\n"));
                }
                //元素属性值
                String attrValue = ((Element) item).getAttribute("authorInfo");
                System.out.println("  " + attrValue);
            }
            // 获得子节点的值，如果没有就不输出;如果子节点还有子节点就继续往下层读
            if (item.getChildNodes().getLength() != 0) {
                readtreestructure(item.getChildNodes());
            }
        }
    }

    public static void main(String[] args) {
        DocumentBuilderFactory docbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder docb = docbf.newDocumentBuilder();

            Document doc = docb.parse("D:\\project\\myproject\\spring-study\\java\\src\\main\\resources\\dom\\test.xml");

            // 获得当前节点的所有子节点
            NodeList nodes = doc.getChildNodes();
            readtreestructure(nodes);
            // 下面决定写个方法一层一层剥开xml文件，由于xml是树的结构所以要用到读取树的方法
        } catch (ParserConfigurationException | SAXException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }




}
