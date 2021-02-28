package actividadservelts;

public class Rotator {
	        private String images[] = { "images/advjHTP1.jpg",
			           "images/cppHTP4.jpg", "images/iw3HTP2.jpg",
			            "images/jwsFEP1.jpg", "images/vbnetHTP2.jpg" };
			            
			       private String links[] = {
			          "http://www.amazon.com/exec/obidos/ASIN/0130895601/" + 
			             "deitelassociatin",
			          "http://www.amazon.com/exec/obidos/ASIN/0130384747/" + 
			             "deitelassociatin",
			          "http://www.amazon.com/exec/obidos/ASIN/0130308978/" + 
			             "deitelassociatin",
			          "http://www.amazon.com/exec/obidos/ASIN/0130461342/" + 
			            "deitelassociatin",
			          "http://www.amazon.com/exec/obidos/ASIN/0130293636/" + 
			             "deitelassociatin" };
			             
			       private int selectedIndex = 0;
			       
			       
			    // returns image file name for current ad  
			              public String getImage()
			              {
			                 return images[ selectedIndex ];
			              }
			           
			              // returns the URL for ad's corresponding Web site
			             public String getLink()
			              {
			                 return links[ selectedIndex ];
			              }
			           
			              // update selectedIndex so next calls to getImage and 
			              // getLink return a different advertisement
			              public void nextAd()
			              {
			                 selectedIndex = ( selectedIndex + 1 ) % images.length;
			              }
			           }
