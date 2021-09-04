package systematicLearn.Java.homework.Day20;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lnh
 * @date 2021年06月29日 22:06
 */
public class Test06 {
    public static void main(String[] args) {
        m();
    }

    public static void m() {
        InputStream in = System.in;
        InputStreamReader sc = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(sc);
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        String str = null;
//        Scanner sc1=new Scanner(System.in);
        List<Teacher> list = new ArrayList<>();
        try {
            while (!(str = br.readLine()).equals("exit")) {
                String[] split = str.split("-");
                if (split.length != 3) {
                    throw new RuntimeException("输入错误");
                }
                Teacher t = new Teacher(Integer.parseInt(split[0]), split[1], Double.parseDouble(split[2]));
                list.add(t);
            }
//            while ((str=sc1.nextLine().equals())
            if (list.size() == 0) {
                throw new RuntimeException("未输入数据");
            } else {
                oos = new ObjectOutputStream(new FileOutputStream("Teacher.txt"));
                oos.writeObject(list);
                ois = new ObjectInputStream(new FileInputStream("Teacher.txt"));
                Object o = ois.readObject();
                List l = (List) o;
                for (Object o1 : l) {
                    System.out.println(o1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (sc != null) {
                try {
                    sc.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (ois != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (oos != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

class Teacher implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private double salary;

    public Teacher(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}