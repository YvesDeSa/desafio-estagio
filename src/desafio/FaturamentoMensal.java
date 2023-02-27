package desafio;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
		
public class FaturamentoMensal {
	  public static void main(String[] args) {
		  File inputFile = new File("dados (2).xml");
          DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
          DocumentBuilder dBuilder;
          Document doc = null;
		try {
			dBuilder = dbFactory.newDocumentBuilder();

			doc = dBuilder.parse(inputFile);
		} catch (ParserConfigurationException e) {
			System.out.println(e.getMessage());
		} catch (SAXException | IOException e) {
			System.out.println(e.getMessage());
		}
         
          doc.getDocumentElement().normalize();

          NodeList nodeList = doc.getElementsByTagName("valor");
          List<Double> valores = new ArrayList<>();

          for (int i = 0; i < nodeList.getLength(); i++) {
              Element node = (Element) nodeList.item(i);
              Double valor = Double.parseDouble(node.getTextContent());
              valores.add(valor);
          }

          Double menor = valores.get(0);
          Double maior = valores.get(0);
          Double soma = 0.0;
          int diasComFaturamento = 0;
          int numDiasAcimaDaMedia = 0;
          
          for (Double valor : valores) {
              if (valor < menor) 
                  menor = valor;
              
              if (valor > maior) 
                  maior = valor;
              
              if (valor > 0) {
                  soma += valor;
                  diasComFaturamento++;
              }
          }
          
          Double media = soma / diasComFaturamento;
          for (Double valor : valores) {
              if (valor > media) 
            	  numDiasAcimaDaMedia++;       
          }
          
          System.out.println("Menor valor de faturamento: " + menor);
          System.out.println("Maior valor de faturamento: " + maior);
          System.out.println("Número de dias com faturamento acima da média: " + numDiasAcimaDaMedia);
	  }
}
