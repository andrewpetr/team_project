package team3;

/**
 * Created by Vika on 15.05.2016.
 */
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {
    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new FileInputStream("Employees.xml"));
        List<Employee> employees = new ArrayList<>();
        NodeList nodeList = document.getDocumentElement().getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node instanceof Element) {
                Employee employee = new Employee();
                NodeList childNodes = node.getChildNodes();
                for (int j = 0; j < childNodes.getLength(); j++) {
                    Node cNode = childNodes.item(j);
                    if (cNode instanceof Element) {
                        String content = cNode.getLastChild().
                                getTextContent().trim();
                        switch (cNode.getNodeName()) {
                            case "Id":
                                employee.id = content;
                             case "Firstname":
                                employee.name = content;
                                break;
                            case "Lastname":
                                employee.lastname = content;
                                break;
                            case "Position":
                                employee.position = content;
                                break;
                            case "Salary":
                                employee.salary = Integer.parseInt(String.valueOf(content));
                                break;
                            case "Phone":
                                employee.phone = content;
                                break;
                        }
                    }
                }
                employees.add(employee);
            }
        }
        System.out.println("Company Employees information:");

        Collections.sort(employees, new SortingEmployees());
        for (int i = 0; i < employees.size(); i++) {

            System.out.println("\nName: "+employees.get(i).name+"  "+employees.get(i).lastname);
            System.out.println("Id: "+employees.get(i).id);
            System.out.println("Position: "+employees.get(i).position);
            System.out.println("Salary: "+employees.get(i).salary);
            System.out.println("Phone: "+employees.get(i).phone);
        }
    }
}
