package h3;

import J3.s;
import Z5.y;
import android.widget.ImageButton;
import n6.InterfaceC1162a;
import o3.C1243n;
import p3.C1309e;

/* renamed from: h3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0813a implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0820h f11333e;

    public /* synthetic */ C0813a(C0820h c0820h, int i4) {
        this.f11332d = i4;
        this.f11333e = c0820h;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f11332d) {
            case 0:
                C0820h c0820h = this.f11333e;
                A4.d dVar = c0820h.f11348L;
                if (dVar != null) {
                    ImageButton imageButton = (ImageButton) dVar.f299i;
                    o6.j.d(imageButton, "btnStop");
                    c0820h.P(imageButton, false);
                    A4.d dVar2 = c0820h.f11348L;
                    if (dVar2 != null) {
                        ImageButton imageButton2 = (ImageButton) dVar2.f298h;
                        o6.j.d(imageButton2, "btnShowActions");
                        c0820h.P(imageButton2, false);
                        A4.d dVar3 = c0820h.f11348L;
                        if (dVar3 != null) {
                            ImageButton imageButton3 = (ImageButton) dVar3.f296f;
                            o6.j.d(imageButton3, "btnActionList");
                            c0820h.P(imageButton3, false);
                            A4.c cVar = c0820h.f11349M;
                            if (cVar != null) {
                                cVar.l(true);
                                return y.f7506a;
                            }
                            o6.j.i("playPauseButtonController");
                            throw null;
                        }
                        o6.j.i("viewBinding");
                        throw null;
                    }
                    o6.j.i("viewBinding");
                    throw null;
                }
                o6.j.i("viewBinding");
                throw null;
            case 1:
                C0820h c0820h2 = this.f11333e;
                A4.d dVar4 = c0820h2.f11348L;
                if (dVar4 != null) {
                    ImageButton imageButton4 = (ImageButton) dVar4.f299i;
                    o6.j.d(imageButton4, "btnStop");
                    c0820h2.P(imageButton4, true);
                    A4.d dVar5 = c0820h2.f11348L;
                    if (dVar5 != null) {
                        ImageButton imageButton5 = (ImageButton) dVar5.f298h;
                        o6.j.d(imageButton5, "btnShowActions");
                        c0820h2.P(imageButton5, true);
                        A4.d dVar6 = c0820h2.f11348L;
                        if (dVar6 != null) {
                            ImageButton imageButton6 = (ImageButton) dVar6.f296f;
                            o6.j.d(imageButton6, "btnActionList");
                            c0820h2.P(imageButton6, true);
                            A4.c cVar2 = c0820h2.f11349M;
                            if (cVar2 != null) {
                                cVar2.k(true);
                                return y.f7506a;
                            }
                            o6.j.i("playPauseButtonController");
                            throw null;
                        }
                        o6.j.i("viewBinding");
                        throw null;
                    }
                    o6.j.i("viewBinding");
                    throw null;
                }
                o6.j.i("viewBinding");
                throw null;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                C0820h c0820h3 = this.f11333e;
                int i4 = 0;
                c0820h3.o().d(c0820h3.k(), new C1309e(new s(0, c0820h3.S(), C0826n.class, "saveEditions", "saveEditions()V", 0, i4, 12), new s(0, c0820h3.S(), C0826n.class, "stopEdition", "stopEdition()V", i4, 0, 13)), true);
                return y.f7506a;
            default:
                C0820h c0820h4 = this.f11333e;
                c0820h4.o().d(c0820h4.k(), new C1243n(new s(0, c0820h4.S(), C0826n.class, "saveEditions", "saveEditions()V", 0, 0, 14)), true);
                return y.f7506a;
        }
    }
}
