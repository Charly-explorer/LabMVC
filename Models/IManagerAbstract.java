/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Models;

import java.util.List;

/**
 *
 * @author Student
 */
public interface IManagerAbstract<T> {  
    
    public boolean add(T element);
    
    public T get(T element); 
        
    public List getAll();
}
