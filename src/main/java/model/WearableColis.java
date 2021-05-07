package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WearableColis {

    private List<Wearable> wearables;
    private LocalDate dateSent;
    private LocalDate dateReceived;
    private Session session;

    public WearableColis(List<Wearable> wearables, LocalDate dateSent, LocalDate dateReceived, Session session) {
        this.wearables = wearables;
        this.dateSent = dateSent;
        this.dateReceived = dateReceived;
        this.session = session;
    }
    
    public WearableColis(){}
    
    public WearableColis createWearableColisFromSession(Session session) throws Exception {
        session.isMaintained();

        LocalDate dateReceived = session.getDate();
        LocalDate dateSent = session.getDateToSendWearableColis();
        int numberOfPlayers =  session.getNumberOfPlayersInSession();
        List<Wearable> wearablesToSend = new Wearable().getWearablesForSession(numberOfPlayers);

        WearableColis wearableColis = new WearableColis(wearablesToSend, dateSent, dateReceived, session);
        return wearableColis;
    }

    public List<Wearable> getWearables() {
        return wearables;
    }

    public void setWearables(List<Wearable> wearables) {
        this.wearables = wearables;
    }

    public LocalDate getDateSent() {
        return dateSent;
    }

    public void setDateSent(LocalDate dateSent) {
        this.dateSent = dateSent;
    }

    public LocalDate getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(LocalDate dateReceived) {
        this.dateReceived = dateReceived;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WearableColis that = (WearableColis) o;
        return Objects.equals(wearables, that.wearables) &&
                Objects.equals(dateSent, that.dateSent) &&
                Objects.equals(dateReceived, that.dateReceived) &&
                Objects.equals(session, that.session);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wearables, dateSent, dateReceived, session);
    }
}
