package q4;

import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import java.util.List;
import o6.C1282a;
import o6.InterfaceC1288g;

/* renamed from: q4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1405k implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A4.a f14112e;

    public /* synthetic */ C1405k(A4.a aVar, int i4) {
        this.f14111d = i4;
        this.f14112e = aVar;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f14111d) {
            case 0:
                return new C1282a(2, this.f14112e, X.class, "setItems", "setItems(Lcom/buzbuz/smartautoclicker/feature/smart/config/databinding/IncludeFieldEventChildrenBinding;Ljava/util/List;)V", 5);
            default:
                return new C1282a(2, this.f14112e, X.class, "setItems", "setItems(Lcom/buzbuz/smartautoclicker/feature/smart/config/databinding/IncludeFieldEventChildrenBinding;Ljava/util/List;)V", 5);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f14111d) {
            case 0:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            default:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
        }
    }

    public final int hashCode() {
        switch (this.f14111d) {
            case 0:
                return a().hashCode();
            default:
                return a().hashCode();
        }
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        int i4 = this.f14111d;
        Z5.y yVar = Z5.y.f7506a;
        A4.a aVar = this.f14112e;
        switch (i4) {
            case 0:
                X.S(aVar, (List) obj);
                return yVar;
            default:
                X.S(aVar, (List) obj);
                return yVar;
        }
    }
}
