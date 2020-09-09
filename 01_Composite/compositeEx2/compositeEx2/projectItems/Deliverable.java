package compositeEx2.projectItems;
import compositeEx2.contacts.Contact;

public class Deliverable extends ProjectItem {
    Contact c;

    public Deliverable(String nameP, String descriptionP, Contact cP) {
        super(nameP, descriptionP);
        c = cP;
    }

    @Override
    public void addProjectItem(ProjectItem e) {
        throw new RuntimeException("Tried to add to a Deliverable");
    }
}
