package k4;

import android.graphics.Rect;
import android.text.Editable;
import android.view.View;
import com.buzbuz.smartautoclicker.R;
import j2.C0902b;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ H f12118e;

    public /* synthetic */ r(H h8, int i4) {
        this.f12117d = i4;
        this.f12118e = h8;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    @Override // n6.InterfaceC1163b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(Object obj) {
        int i4;
        C0902b c0902b;
        switch (this.f12117d) {
            case 0:
                o6.j.e((View) obj, "it");
                this.f12118e.a();
                break;
            case 1:
                H.G(this.f12118e, (View) obj);
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                o6.j.e((View) obj, "it");
                H h8 = this.f12118e;
                if (h8.J().f12065c.f1950e.h()) {
                    q4.X.Y(h8.k(), R.string.warning_dialog_message_condition_delete_associated_action, new C0986s(h8, 0));
                } else {
                    h8.I();
                }
                return Z5.y.f7506a;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                Editable editable = (Editable) obj;
                o6.j.e(editable, "it");
                X J6 = this.f12118e.J();
                String obj2 = editable.toString();
                o6.j.e(obj2, "name");
                H3.n nVar = J6.f12065c;
                C0902b c0902b2 = (C0902b) nVar.f1950e.b();
                if (c0902b2 != null) {
                    nVar.k(C0902b.i(c0902b2, null, null, obj2, 0, null, 0, 0, false, null, 1019));
                }
                return Z5.y.f7506a;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                Integer num = (Integer) obj;
                X J8 = this.f12118e.J();
                int i8 = 1;
                if (num == null || num.intValue() != 0) {
                    if (num != null && num.intValue() == 1) {
                        i8 = 2;
                    } else {
                        i4 = 3;
                        H3.n nVar2 = J8.f12065c;
                        c0902b = (C0902b) nVar2.f1950e.b();
                        if (c0902b != null) {
                            Rect rect = c0902b.j;
                            if (rect == null && i4 == 3) {
                                rect = c0902b.f11794f;
                            }
                            nVar2.k(C0902b.i(c0902b, null, null, null, 0, null, 0, i4, false, rect, 383));
                        }
                        return Z5.y.f7506a;
                    }
                }
                i4 = i8;
                H3.n nVar22 = J8.f12065c;
                c0902b = (C0902b) nVar22.f1950e.b();
                if (c0902b != null) {
                }
                return Z5.y.f7506a;
            default:
                float floatValue = ((Float) obj).floatValue();
                X J9 = this.f12118e.J();
                int x8 = h2.a.x(floatValue);
                H3.n nVar3 = J9.f12065c;
                C0902b c0902b3 = (C0902b) nVar3.f1950e.b();
                if (c0902b3 != null) {
                    nVar3.k(C0902b.i(c0902b3, null, null, null, 0, null, x8, 0, false, null, 959));
                }
                return Z5.y.f7506a;
        }
        return Z5.y.f7506a;
    }
}
