import java.util.*;

class Book
{
    public String Name;
    public int Prize;

    public Book(String s, int i)
    {
        this.Name = s;
        this.Prize = i;
    }

    public void Display()
    {
        System.out.println("Book name : "+this.Name+"Prize : "+this.Prize);
    }
}

class Collections3
{
    public static void main(String arg[])
    {
        LinkedList <Book>lobj = new LinkedList<Book>();

        lobj.bobj1(new Book("Let us C",400));
        lobj.bobj2(new Book("Data Structure",580));
        lobj.bobj3(new Book("C++ Programming",980));
        lobj.bobj4(new Book("Angular web Development",790));

        lobj.add(bobj1);
        lobj.add(bobj2);
        lobj.add(bobj3);
        lobj.add(bobj4);

        Iterator iobj = lobj.iterator();
        Book bref = null;

        System.out.println("Elements of linked list are :");
        while(iobj.hasNext())
        {
            bref = (Book)iobj.next();
            bref.Display();
        }
        lobj.clear();


    }
}