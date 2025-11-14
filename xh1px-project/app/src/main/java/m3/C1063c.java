package m3;

import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import e3.C0642a;
import o6.C1282a;
import o6.InterfaceC1288g;
import q4.X;

/* renamed from: m3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1063c implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1079s f12440e;

    public /* synthetic */ C1063c(C1079s c1079s, int i4) {
        this.f12439d = i4;
        this.f12440e = c1079s;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f12439d) {
            case 0:
                return new C1282a(2, this.f12440e, C1079s.class, "updateSaveButton", "updateSaveButton(Z)V", 4);
            case 1:
                return new C1282a(2, this.f12440e, C1079s.class, "updateFieldPosition", "updateFieldPosition(Ljava/lang/String;)V", 4);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return new C1282a(2, this.f12440e, C1079s.class, "updateDumbSwipePressDuration", "updateDumbSwipePressDuration(Ljava/lang/String;)V", 4);
            default:
                return new C1282a(2, this.f12440e, C1079s.class, "updateDumbSwipeRepeatDelay", "updateDumbSwipeRepeatDelay(Ljava/lang/String;)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f12439d) {
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
            default:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
        }
    }

    public final int hashCode() {
        switch (this.f12439d) {
            case 0:
                return a().hashCode();
            case 1:
                return a().hashCode();
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return a().hashCode();
            default:
                return a().hashCode();
        }
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        int i4 = this.f12439d;
        Z5.y yVar = Z5.y.f7506a;
        C1079s c1079s = this.f12440e;
        switch (i4) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C0642a c0642a = c1079s.f12476z;
                if (c0642a != null) {
                    X.P(c0642a.k, booleanValue);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            case 1:
                String str = (String) obj;
                C0642a c0642a2 = c1079s.f12476z;
                if (c0642a2 != null) {
                    A4.c cVar = c0642a2.j;
                    o6.j.d(cVar, "fieldSelectionPosition");
                    E2.c.o0(cVar, str);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                String str2 = (String) obj;
                C0642a c0642a3 = c1079s.f12476z;
                if (c0642a3 != null) {
                    A.i iVar = c0642a3.f10602f;
                    o6.j.d(iVar, "fieldDuration");
                    E2.c.y0(iVar, str2, 2);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            default:
                String str3 = (String) obj;
                C0642a c0642a4 = c1079s.f12476z;
                if (c0642a4 != null) {
                    A.i iVar2 = c0642a4.f10605i;
                    o6.j.d(iVar2, "fieldRepeatDelay");
                    E2.c.y0(iVar2, str3, 2);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
        }
    }
}
