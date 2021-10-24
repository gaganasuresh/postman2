package countries.cricket.model;


import javax.persistence.*;

@Entity
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column
    private int jerseyno;
    @Column
    private String countname;
    @Column
    private String playername;

    public long getId() {
        return id;
    }

    public int getJerseyno() {
        return jerseyno;
    }

    public String getCountname() {
        return countname;
    }

    public String getPlayername() {
        return playername;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setJerseyno(int jerseyno) {
        this.jerseyno = jerseyno;
    }

    public void setCountname(String countname) {
        this.countname = countname;
    }

    public void setPlayername(String playername) {
        this.playername = playername;
    }

}
