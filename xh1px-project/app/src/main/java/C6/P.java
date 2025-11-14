package C6;

import q7.InterfaceC1423d;
import w7.AbstractC1759v;

/* loaded from: classes.dex */
public final class P implements InterfaceC1423d, O {

    /* renamed from: e, reason: collision with root package name */
    public static final P f727e = new P(0);

    /* renamed from: f, reason: collision with root package name */
    public static final P f728f = new P(1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f729d;

    public /* synthetic */ P(int i4) {
        this.f729d = i4;
    }

    @Override // q7.InterfaceC1423d
    public AbstractC1759v b() {
        switch (this.f729d) {
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                throw new IllegalStateException("This method should not be called");
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                throw new IllegalStateException("This method should not be called");
            default:
                throw new IllegalStateException("This method should not be called");
        }
    }

    public String toString() {
        switch (this.f729d) {
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                return "NO_SOURCE";
            default:
                return super.toString();
        }
    }
}
