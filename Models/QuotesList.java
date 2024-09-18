/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Student
 */
public class QuotesList implements IManagerAbstract<Quote>{
    
    private HashMap<Integer,Quote> quoteList;

    public QuotesList() {
        quoteList = new HashMap<>();
    }

    @Override
    public boolean add(Quote element) {
        quoteList.put(Integer.valueOf(element.getId()), element);
        return true;
    }

    @Override
    public Quote get(Quote element) {
        return quoteList.get(element.getId());
    }

    @Override
    public List getAll() {
        return (List) quoteList;
    }

}
