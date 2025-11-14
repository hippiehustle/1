package h3;

import O7.InterfaceC0234g;
import Z5.y;
import android.widget.ImageButton;
import d6.InterfaceC0617c;
import o6.C1282a;
import o6.InterfaceC1288g;

/* renamed from: h3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0814b implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0820h f11335e;

    public /* synthetic */ C0814b(C0820h c0820h, int i4) {
        this.f11334d = i4;
        this.f11335e = c0820h;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f11334d) {
            case 0:
                return new C1282a(2, this.f11335e, C0820h.class, "updateMenuPlayingState", "updateMenuPlayingState(Z)V", 4);
            default:
                return new C1282a(2, this.f11335e, C0820h.class, "updatePlayPauseButtonEnabledState", "updatePlayPauseButtonEnabledState(Z)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f11334d) {
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
        switch (this.f11334d) {
            case 0:
                return a().hashCode();
            default:
                return a().hashCode();
        }
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        switch (this.f11334d) {
            case 0:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                C0820h c0820h = this.f11335e;
                A4.d dVar = c0820h.f11348L;
                if (dVar != null) {
                    Object tag = ((ImageButton) dVar.f297g).getTag();
                    if (!o6.j.a(tag, bool)) {
                        A4.d dVar2 = c0820h.f11348L;
                        if (dVar2 != null) {
                            ((ImageButton) dVar2.f297g).setTag(bool);
                            if (booleanValue) {
                                if (tag == null) {
                                    A4.c cVar = c0820h.f11349M;
                                    if (cVar != null) {
                                        cVar.l(false);
                                    } else {
                                        o6.j.i("playPauseButtonController");
                                        throw null;
                                    }
                                } else {
                                    c0820h.E(new C0813a(c0820h, 0));
                                }
                            } else if (tag == null) {
                                A4.c cVar2 = c0820h.f11349M;
                                if (cVar2 != null) {
                                    cVar2.k(false);
                                } else {
                                    o6.j.i("playPauseButtonController");
                                    throw null;
                                }
                            } else {
                                c0820h.E(new C0813a(c0820h, 1));
                            }
                        } else {
                            o6.j.i("viewBinding");
                            throw null;
                        }
                    }
                    return y.f7506a;
                }
                o6.j.i("viewBinding");
                throw null;
            default:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                C0820h c0820h2 = this.f11335e;
                A4.d dVar3 = c0820h2.f11348L;
                if (dVar3 != null) {
                    c0820h2.O((ImageButton) dVar3.f297g, booleanValue2, false);
                    return y.f7506a;
                }
                o6.j.i("viewBinding");
                throw null;
        }
    }
}
