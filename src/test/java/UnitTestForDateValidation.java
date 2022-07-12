/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Helper.DateValidator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
/**
 *
 * @author MyPC
 */
public class UnitTestForDateValidation { 
    DateValidator dateValidator = null;
    
    public UnitTestForDateValidation() {
    }
    
    @BeforeAll
    public void setUp() {
         dateValidator = new DateValidator();
    }
    
//    @Test
//    public void TestLeapYear(){
//        assertEquals(false, dateValidator.isLeap(2001));
//        assertEquals(false, dateValidator.isLeap(2002));
//        assertEquals(false, dateValidator.isLeap(2003));
//        assertEquals(true, dateValidator.isLeap(2004));
//    }

//    @Test
//    public void PositiveTest(){
//        assertEquals(true, dateValidator.isValidDate(12, 12, 2001, new StringBuilder(), new StringBuilder()));
//        assertEquals(true, dateValidator.isValidDate(12, 01, 2001, new StringBuilder(), new StringBuilder()));      
//    }
//    
     @Test
    public void UTCID01(){       
        assertEquals(true, dateValidator.isValidDate("29", "2", "2000", new StringBuilder(), new StringBuilder()));
    }
    
     @Test
    public void UTCID02(){       
        assertEquals(false, dateValidator.isValidDate("29", "2", "2009", new StringBuilder(), new StringBuilder()));
    }
    
     @Test
    public void UTCID03(){       
        assertEquals(false, dateValidator.isValidDate("31", "2", "2020", new StringBuilder(), new StringBuilder()));
    }
    
     @Test
    public void UTCID04(){       
        assertEquals(false, dateValidator.isValidDate("hai muoi", null, null, new StringBuilder(), new StringBuilder()));
    }
    
     @Test
    public void UTCID05(){       
        assertEquals(false, dateValidator.isValidDate(null, "3", "2000", new StringBuilder(), new StringBuilder()));
    }
    
     @Test
    public void UTCID06(){       
        assertEquals(false, dateValidator.isValidDate("31", "thang 2", "Nam 2012", new StringBuilder(), new StringBuilder()));
    }
    
     @Test
    public void UTCID07(){       
        assertEquals(true, dateValidator.isValidDate("28", "4", "2009", new StringBuilder(), new StringBuilder()));
    }
    
     @Test
    public void UTCID08(){       
        assertEquals(true, dateValidator.isValidDate("30", "3", "2020", new StringBuilder(), new StringBuilder()));
    }
    
     @Test
    public void UTCID09(){       
        assertEquals(false, dateValidator.isValidDate(null, null, null, new StringBuilder(), new StringBuilder()));
    }
    
     @Test
    public void UTCID10(){       
        assertEquals(false, dateValidator.isValidDate("-3", "2", "2009", new StringBuilder(), new StringBuilder()));
    }
    
     @Test
    public void UTCID11(){       
        assertEquals(false, dateValidator.isValidDate("0", "3", "2020", new StringBuilder(), new StringBuilder()));
    }
    
     @Test
    public void UTCID12(){       
        assertEquals(false, dateValidator.isValidDate("50", null, "2009", new StringBuilder(), new StringBuilder()));
    }
    
     @Test
    public void UTCID13(){       
        assertEquals(false, dateValidator.isValidDate("28", "20", "2009", new StringBuilder(), new StringBuilder()));
    }
}
