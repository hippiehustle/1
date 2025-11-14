package d5;

import O7.InterfaceC0234g;
import Z5.y;
import d6.InterfaceC0617c;
import o6.C1282a;
import o6.InterfaceC1288g;

/* renamed from: d5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0611c implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A4.c f10406e;

    public /* synthetic */ C0611c(A4.c cVar, int i4) {
        this.f10405d = i4;
        this.f10406e = cVar;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f10405d) {
            case 0:
                return new C1282a(2, this.f10406e, E2.b.class, "setChecked", "setChecked(Lcom/buzbuz/smartautoclicker/core/ui/databinding/IncludeFieldSwitchBinding;Z)V", 5);
            case 1:
                return new C1282a(2, this.f10406e, E2.b.class, "setChecked", "setChecked(Lcom/buzbuz/smartautoclicker/core/ui/databinding/IncludeFieldSwitchBinding;Z)V", 5);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return new C1282a(2, this.f10406e, E2.b.class, "setChecked", "setChecked(Lcom/buzbuz/smartautoclicker/core/ui/databinding/IncludeFieldSwitchBinding;Z)V", 5);
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return new C1282a(2, this.f10406e, E2.b.class, "setChecked", "setChecked(Lcom/buzbuz/smartautoclicker/core/ui/databinding/IncludeFieldSwitchBinding;Z)V", 5);
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return new C1282a(2, this.f10406e, E2.b.class, "setChecked", "setChecked(Lcom/buzbuz/smartautoclicker/core/ui/databinding/IncludeFieldSwitchBinding;Z)V", 5);
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return new C1282a(2, this.f10406e, E2.b.class, "setChecked", "setChecked(Lcom/buzbuz/smartautoclicker/core/ui/databinding/IncludeFieldSwitchBinding;Z)V", 5);
            default:
                return new C1282a(2, this.f10406e, E2.b.class, "setChecked", "setChecked(Lcom/buzbuz/smartautoclicker/core/ui/databinding/IncludeFieldSwitchBinding;Z)V", 5);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f10405d) {
            case 0:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            case 1:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
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
        switch (this.f10405d) {
            case 0:
                return a().hashCode();
            case 1:
                return a().hashCode();
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return a().hashCode();
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return a().hashCode();
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return a().hashCode();
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return a().hashCode();
            default:
                return a().hashCode();
        }
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        int i4 = this.f10405d;
        y yVar = y.f7506a;
        A4.c cVar = this.f10406e;
        switch (i4) {
            case 0:
                E2.b.H(cVar, ((Boolean) obj).booleanValue());
                return yVar;
            case 1:
                E2.b.H(cVar, ((Boolean) obj).booleanValue());
                return yVar;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                E2.b.H(cVar, ((Boolean) obj).booleanValue());
                return yVar;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                E2.b.H(cVar, ((Boolean) obj).booleanValue());
                return yVar;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                E2.b.H(cVar, ((Boolean) obj).booleanValue());
                return yVar;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                E2.b.H(cVar, ((Boolean) obj).booleanValue());
                return yVar;
            default:
                E2.b.H(cVar, ((Boolean) obj).booleanValue());
                return yVar;
        }
    }
}
