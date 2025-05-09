package Exceptions;

import Models.Student;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class ExceptionClient {
    public static void main(String[] args) {
        Student s = null;
        //Database db = new Database();
        try {
            s.getBatch();
            //db.save(s);
        } catch (NullPointerException e) {
            System.out.println("Student was null");
//        } catch (SQLException e ) {
//            System.out.println("DB error");
//        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {

        }
        find(0);
    }

    static void find(int x) {
//        if(x%2==0) {
//            throw new IOException("Test");
//        }
//        if(x%3==0) {
//            throw new FileNotFoundException("Test");
//        }
    }

}
