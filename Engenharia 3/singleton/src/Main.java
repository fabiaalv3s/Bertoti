public class Main
{
    public static void main(String[] args)
    {

        FakeImage newImage = ImageLoader.getInstance().loadImage("azul");
        ImageLoader image3 = ImageLoader.getInstance();
        System.out.println("Carregando uma nova imagem " + newImage.getColor());
        System.out.println(image3);

        FakeImage newImage1 = ImageLoader.getInstance().loadImage("rosa");
        ImageLoader image2 = ImageLoader.getInstance();
        System.out.println("Carregando uma nova imagem " + newImage1.getColor());
        System.out.println(image2);




    }
}