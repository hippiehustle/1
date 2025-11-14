package J3;

import L7.AbstractC0166y;
import android.widget.ImageButton;
import androidx.lifecycle.EnumC0504o;
import androidx.lifecycle.U;
import l0.C0997a;
import n6.InterfaceC1162a;

/* renamed from: J3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0076a implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2426d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f2427e;

    public /* synthetic */ C0076a(u uVar, int i4) {
        this.f2426d = i4;
        this.f2427e = uVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        int i4 = this.f2426d;
        Z5.y yVar = Z5.y.f7506a;
        u uVar = this.f2427e;
        switch (i4) {
            case 0:
                H S8 = uVar.S();
                C0077b c0077b = new C0077b(uVar, 0);
                C0997a g8 = U.g(S8);
                S7.e eVar = L7.F.f3175a;
                AbstractC0166y.q(g8, S7.d.f5456f, null, new y(S8, c0077b, null), 2);
                return yVar;
            case 1:
                F3.m mVar = uVar.f2468M;
                if (mVar != null) {
                    ImageButton imageButton = (ImageButton) mVar.f1374g;
                    o6.j.d(imageButton, "btnStop");
                    uVar.P(imageButton, true);
                    F3.m mVar2 = uVar.f2468M;
                    if (mVar2 != null) {
                        ImageButton imageButton2 = (ImageButton) mVar2.f1372e;
                        o6.j.d(imageButton2, "btnClickList");
                        uVar.P(imageButton2, true);
                        A4.c cVar = uVar.f2469N;
                        if (cVar != null) {
                            cVar.k(true);
                            return yVar;
                        }
                        o6.j.i("playPauseButtonController");
                        throw null;
                    }
                    o6.j.i("viewBinding");
                    throw null;
                }
                o6.j.i("viewBinding");
                throw null;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                F3.m mVar3 = uVar.f2468M;
                if (mVar3 != null) {
                    ImageButton imageButton3 = (ImageButton) mVar3.f1374g;
                    o6.j.d(imageButton3, "btnStop");
                    uVar.P(imageButton3, false);
                    F3.m mVar4 = uVar.f2468M;
                    if (mVar4 != null) {
                        ImageButton imageButton4 = (ImageButton) mVar4.f1372e;
                        o6.j.d(imageButton4, "btnClickList");
                        uVar.P(imageButton4, false);
                        A4.c cVar2 = uVar.f2469N;
                        if (cVar2 != null) {
                            cVar2.l(true);
                            return yVar;
                        }
                        o6.j.i("playPauseButtonController");
                        throw null;
                    }
                    o6.j.i("viewBinding");
                    throw null;
                }
                o6.j.i("viewBinding");
                throw null;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                uVar.U();
                return yVar;
            default:
                if (uVar.j.f8862d.compareTo(EnumC0504o.f8848f) >= 0) {
                    uVar.o().f(uVar.k(), null);
                    uVar.S().e();
                }
                return yVar;
        }
    }
}
