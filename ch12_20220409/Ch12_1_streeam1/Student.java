/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20220409.Ch12_1_streeam1;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
/**
 *
 * @author xvpow
 */
public class Student {
    private List<Book> books = new ArrayList<>();
    
    public void append(Book book){
        books.add(book);
    }
    
    public List<Book> getBooks(){
        return books;
    }
    
    public Stream<Book> getBookStream(){
        return books.stream();
    }
}
