import java.applet.*;

import java.awt.*;

public class Animation extends Applet

  {

    Image pic;

    public void init()

      {

        pic =getImage(getDocumentBase(),"spider.gif");

      }
  
public void paint(Graphics grp)

{

  grp.drawImage(pic, 100,30,this);

}
  }

