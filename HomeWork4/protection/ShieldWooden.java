package protection;

public class ShieldWooden extends Protect{
    private final int hitsProtection = 15;
    @Override
    public int protects() {
        return hitsProtection;
    }
}
