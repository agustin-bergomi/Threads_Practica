package com.agustinbergomi.lib_threads1;

//Hay dos maneras de usar threads en java
//una es extendiendo de la clase thread
public class ThreadExample extends Thread{
//Cuando extendemos de la clase thread obtenemos el metodo run()

    @Override
    public void run() {
//        aca hago alguna tarea que lleve cierto tiempo
//        en este caso va aumentando de a 1 unidad la variable i
        int i = 1;
        while(i <= 100) {
            System.out.println(i + " " + this.getName());
            i++;
        }
    }
}
