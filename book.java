class book
{
    String name;
    int weight;
    int Number_of_pages;
    void turn_forward(int current_page)
    {
    System.out.println("You are turning to"+current_page+1);
    }
    void turn_backward(int current_page)
    {
    System.out.println("You are turning to"+(current_page-1));
    }

}