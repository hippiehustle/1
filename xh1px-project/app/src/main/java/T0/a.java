package T0;

import Q0.f;
import Q0.j;
import Q0.n;
import Z.g;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends D6.b {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5486f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i4, List list) {
        super(list);
        this.f5486f = i4;
    }

    @Override // T0.e
    public final Q0.e r0() {
        switch (this.f5486f) {
            case 0:
                return new f(0, (List) this.f1023e);
            case 1:
                return new j(0, (List) this.f1023e);
            case g.FLOAT_FIELD_NUMBER /* 2 */:
                return new f(1, (List) this.f1023e);
            case g.INTEGER_FIELD_NUMBER /* 3 */:
                return new j(1, (List) this.f1023e);
            case g.LONG_FIELD_NUMBER /* 4 */:
                return new j(2, (List) this.f1023e);
            case g.STRING_FIELD_NUMBER /* 5 */:
                return new n((List) this.f1023e);
            default:
                return new f(2, (List) this.f1023e);
        }
    }
}
