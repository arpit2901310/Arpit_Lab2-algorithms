package com.notecount.arpit.main;

import java.util.Scanner;

import com.notecount.arpit.service.MergeSortImplementation;
import com.notecount.arpit.service.NoteCount;

public class NoteCountDriver {

	public static void main(String[] args) {
		MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
		NoteCount noteCount = new NoteCount ();
		System.out.println("enter the size of currency denominations");
		Scanner sc =new Scanner(System.in);
		int size =sc.nextInt();
		int[] notes = new int[size];
		System.out.println("enter the currency denomination value");
		for (int i=0; i < size; i++)  {
			notes[size] = sc.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		mergeSortImplementation.sort(notes,0,notes.length-1);
		noteCount.notesCountImplementation(notes, amount);
		sc.close();

	}

}
