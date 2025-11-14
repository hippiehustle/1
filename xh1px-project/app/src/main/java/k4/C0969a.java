package k4;

import a6.AbstractC0436k;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import j2.C0902b;
import n6.InterfaceC1163b;

/* renamed from: k4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0969a implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12077d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0971c f12078e;

    public /* synthetic */ C0969a(C0971c c0971c, int i4) {
        this.f12077d = i4;
        this.f12078e = c0971c;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        switch (this.f12077d) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                o6.j.e(bitmap, "screenshot");
                C0971c c0971c = this.f12078e;
                N2.d dVar = c0971c.f12083L;
                if (dVar != null) {
                    R2.c cVar = dVar.f3729e;
                    if (cVar != null) {
                        cVar.j = new BitmapDrawable(dVar.getResources(), bitmap);
                        T2.b bVar = dVar.f3731g;
                        if (bVar != null) {
                            bVar.f5667g = AbstractC0436k.U0(bVar.f5665e.keySet());
                            bVar.e(255);
                            bVar.f(bVar.f5668h);
                            F3.a aVar = dVar.f3732h;
                            if (aVar != null) {
                                B0.e eVar = new B0.e(7, dVar);
                                AnimatorSet animatorSet = (AnimatorSet) aVar.f1305f;
                                if (animatorSet.isRunning()) {
                                    animatorSet.end();
                                }
                                animatorSet.addListener(new L2.c(eVar, aVar, 1));
                                animatorSet.start();
                                c0971c.S(3);
                                return Z5.y.f7506a;
                            }
                            o6.j.i("animations");
                            throw null;
                        }
                        o6.j.i("hintsIcons");
                        throw null;
                    }
                    o6.j.i("capture");
                    throw null;
                }
                o6.j.i("selectorView");
                throw null;
            default:
                C0902b c0902b = (C0902b) obj;
                o6.j.e(c0902b, "imageCondition");
                C0971c c0971c2 = this.f12078e;
                c0971c2.a();
                c0971c2.f12081I.m(c0902b);
                return Z5.y.f7506a;
        }
    }
}
