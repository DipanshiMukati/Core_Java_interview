package com.rays.oop.Interface;

/**
 * @author lokesh solanki
 * in this interface sir say if we remove the static and final keywork
 * of this variable so what happens
 * ans is = nothing will happen our code compiled successfully because 
 *	the default state of an variable of an interface is static and final
 *  so its optional to use.
 *  but as a good programmer we should use this keywords 
 */
//
//Agar interface ke variable se static aur final hata bhi do, to code fir bhi compile ho jayega.
//
//Kyunki by default interface ke variables hamesha static aur final hote hain, lekin good practice ke liye ye keywords lagana chahiye.

public interface Interfacee {
	
	public static final int a =3;
	public  int sum (int a ,int b);

}