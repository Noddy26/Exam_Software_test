package gmit.ie;

//Neil Morrison
//05/03/2020
//G00339724@gmit.ie

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class EmployeeTests {

    Employee employee;


    @BeforeAll
    static void startTests(){
        System.out.println("Beginning Tests");
    }

    @AfterAll
    static void finishedTest(){
        System.out.println("Finished Tests");
    }

    @BeforeEach
    void init(TestInfo testinfo, TestReporter testreporter){
        testreporter.publishEntry(("Testing " + testinfo.getDisplayName()));
    }

    @DisplayName("Constructor")
    @Test
    void testConstructor(){
        employee = new Employee("Mr", "Neil Morrison", 123456, "08712345", "Full-time", 18);
        assertEquals("Mr", employee.getTitle());
        assertEquals("Neil Morrison", employee.getName());
        assertEquals(123456, employee.getPps());
        assertEquals("08712345", employee.getPhone());
        assertEquals("Full-time", employee.getEmployementType());
        assertEquals(18, employee.getAge());
    }

    @DisplayName("Employee Title")
    @Test
    void testTitle(){
        final String error1 = "Title must be Mr, Mrs, or Miss";
        Exception titleException = assertThrows(IllegalArgumentException.class, ()-> new Employee("", "Neil Morrison", 123456, "08712345", "Full-time", 18));
        assertEquals(error1, titleException.getMessage());
    }
    @DisplayName("Employee Name Under 5 characters")
    @Test
    void testName1(){
        final String error2 = "Name must be a least 5 characters long";
        Exception name1Exception = assertThrows(IllegalArgumentException.class, ()-> new Employee("Mr", "Neil", 123456, "08712345", "Full-time", 18));
        assertEquals(error2, name1Exception.getMessage());
    }
    @DisplayName("Employee Name over 22 characters")
    @Test
    void testName2(){
        final String error3 = "Name must be under 22 characters long";
        Exception name2Exception = assertThrows(IllegalArgumentException.class, ()-> new Employee("Mr", "Neil Morrisonderthjrbdheld", 123456, "08712345", "Full-time", 18));
        assertEquals(error3, name2Exception.getMessage());
    }
    @DisplayName("PPS Number is 6 characters")
    @Test
    void testPPS(){
        final String error4 = "pps must be six characters";
        Exception ppsException = assertThrows(IllegalArgumentException.class, ()-> new Employee("Mr", "Neil Morrison", 123, "08712345", "Full-time", 18));
        assertEquals(error4, ppsException.getMessage());
    }
    @DisplayName("Phone is 7 digits")
    @Test
    void testPhone(){
        final String error5 = "phone number must be 7 digits";
        Exception phoneException = assertThrows(IllegalArgumentException.class, ()-> new Employee("Mr", "Neil Morrison", 123456, "0871", "Full-time", 18));
        assertEquals(error5, phoneException.getMessage());
    }
    @DisplayName("EmploymentType is a specific string")
    @Test
    void testEmployment(){
        final String error6 = "Employment type can only be either Full-time or Part-time";
        Exception employException = assertThrows(IllegalArgumentException.class, ()-> new Employee("Mr", "Neil Morrison", 123456, "08712345", "part", 18));
        assertEquals(error6, employException.getMessage());
    }
    @DisplayName("Employee is over 18")
    @Test
    void testAge(){
        final String error7 = "Employee must be over the age of 18";
        Exception ageException = assertThrows(IllegalArgumentException.class, ()-> new Employee("Mr", "Neil Morrison", 123456, "08712345", "Full-time", 16));
        assertEquals(error7, ageException.getMessage());
    }
}
