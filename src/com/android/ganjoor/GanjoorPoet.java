/**
 * 
 */
package com.android.ganjoor;

/**
 * @author Hamid Reza
 * @database-table poet
 * @summary اطلاعات شاعر
 */
public class GanjoorPoet {
	/**
	 * سازندۀ پیش فرض : یک نمونه از کلاس را با مقادیر ورودی می سازد
	 */   	
	public GanjoorPoet(int ID, String Name, int CatID, String Bio)
    {
        _Name = Name;
        _ID = ID;
        _CatID = CatID;
        _Bio = Bio;
    }	
    /**
    * @summary نام شاعر    
    * @database-field name
    */
    public String _Name;
    /**
    * @summary شناسۀ رکورد شاعر    
    * database-field: id
    */
    public int _ID;
    /**
    * @summary شناسۀ بخش مرتبط با شاعر
    * id در جدول cat
    * هر شاعر یک بخش مختص به خودش دارد که عموماً parent_id آن صفر است.    
    * @database-field cat_id
    */
    public int _CatID;
    /**
    * @summary زندگینامه یا توضیحات دربارۀ شاعر
    * این فیلد از ساغر وارد گنجور رومیزی شده است.    
    * @database-field description
    */
    public String _Bio;
}
