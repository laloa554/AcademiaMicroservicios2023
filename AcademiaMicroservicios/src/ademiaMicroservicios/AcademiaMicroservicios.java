package ademiaMicroservicios;

import java.util.ArrayList;
import java.util.List;

import EstructuraDeDatos.array.Arrays;
import EstructuraDeDatos.linkedList.LinkedList;
import EstructuraDeDatos.queue.DynamicQueue;
import EstructuraDeDatos.queue.StaticQueue;
import EstructuraDeDatos.stack.DynamicStack;
import EstructuraDeDatos.stack.StaticStack;
import claseAbstracta.Cuadrado;
import claseAbstracta.Figura;
import claseAbstracta.Triangulo;
import herencia.MultiniveJerarquica.Acuatico;
import herencia.MultiniveJerarquica.Auto;
import herencia.MultiniveJerarquica.Barco;
import herencia.MultiniveJerarquica.Moto;
import herencia.MultiniveJerarquica.Submarino;
import herencia.MultiniveJerarquica.Vehiculo;
import herencia.Multiple.TodoTerreno;
import herencia.Simple.Person;
import herencia.Simple.Student;

public class AcademiaMicroservicios {

	public static void main(String[] args) throws Exception {
			
		///Arrays
		/*Arrays a = new Arrays();
		int []simpleArray = {1,2,3,4,5,6,7,8,9};
		int [][]matrix = {{1,2,3},{4,5,6},{7,8,9}};
		a.setSimpleArray(simpleArray);
		a.showArray();
		a.setMatrix(matrix);
		a.showMatriz();*/
		
		/*ArrayList <Integer> dynamicArray = new ArrayList <Integer>();		
		dynamicArray.add(1);
		dynamicArray.add(2);
		dynamicArray.add(3);
		dynamicArray.add(4);
		System.out.println(dynamicArray.toString());*/
		
		//Stack	
		/*StaticStack staticStack = new StaticStack(5);
		staticStack.push(1);
		staticStack.push(2);
		staticStack.push(3);
		staticStack.push(4);
		staticStack.push(5);
		staticStack.push(6);
		staticStack.pop();
		staticStack.push(6);
		staticStack.pop();
		staticStack.pop();
		staticStack.pop();
		staticStack.pop();
		staticStack.pop();
		staticStack.pop();
		staticStack.push(1);
		staticStack.push(2);
		staticStack.push(3);
		staticStack.topStack();
		staticStack.showStack();*/
		
		/*DynamicStack dynamicStack = new DynamicStack();
		dynamicStack.push(1);
		dynamicStack.push(2);
		dynamicStack.push(3);
		dynamicStack.push(4);
		dynamicStack.push(5);
		dynamicStack.showStack();
		dynamicStack.pop();
		dynamicStack.showStack();
		dynamicStack.topStack();
		dynamicStack.pop();
		dynamicStack.showStack();
		dynamicStack.topStack();*/
		
		//Queue
		/*StaticQueue staticQueue = new StaticQueue(5);
		staticQueue.enqueue(1);
		staticQueue.enqueue(2);
		staticQueue.enqueue(3);
		staticQueue.enqueue(4);
		staticQueue.enqueue(5);
		staticQueue.enqueue(6);
		staticQueue.showQueue();
		staticQueue.dequeuer();
		staticQueue.showQueue();
		staticQueue.enqueue(7);
		staticQueue.showQueue();
		staticQueue.dequeuer();
		staticQueue.showQueue();
		staticQueue.topQueue();*/
		
		/*DynamicQueue dynamicQueue = new DynamicQueue();
		dynamicQueue.enqueue(1);
		dynamicQueue.enqueue(2);
		dynamicQueue.enqueue(3);
		dynamicQueue.enqueue(4);
		dynamicQueue.enqueue(5);
		dynamicQueue.showQueue();
		dynamicQueue.dequeuer();
		dynamicQueue.showQueue();
		dynamicQueue.dequeuer();
		dynamicQueue.showQueue();
		dynamicQueue.topQueue();*/
		
		
		// Linked list.
		LinkedList list = new LinkedList();
		list.inssertAtTheEnd(1);
		list.inssertAtTheEnd(2);
		list.inssertAtTheEnd(3);
		list.inssertAtTheEnd(4);
		list.inssertAtTheEnd(5);
		list.show();
		list.deleteAtHead();
		list.show();
		list.delete();
		list.show();
		list.inssertAtHead(1);
		list.inssertAtHead(2);
		list.inssertAtHead(3);
		list.inssertAtHead(4);
		list.inssertAtHead(5);
		list.show();
		list.deleteAtTheEnd();
		list.show();
		list.searchNumber(7);
		
		
	}

}
