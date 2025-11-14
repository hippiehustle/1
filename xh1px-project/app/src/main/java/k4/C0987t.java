package k4;

import O7.InterfaceC0234g;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.slider.Slider;
import d6.InterfaceC0617c;
import o6.C1282a;
import o6.InterfaceC1288g;

/* renamed from: k4.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0987t implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ H f12122e;

    public /* synthetic */ C0987t(H h8, int i4) {
        this.f12121d = i4;
        this.f12122e = h8;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f12121d) {
            case 0:
                return new C1282a(2, this.f12122e, H.class, "onConditionEditingStateChanged", "onConditionEditingStateChanged(Z)V", 4);
            case 1:
                return new C1282a(2, this.f12122e, H.class, "updateConditionName", "updateConditionName(Ljava/lang/String;)V", 4);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return new C1282a(2, this.f12122e, H.class, "updateConditionBitmap", "updateConditionBitmap(Landroid/graphics/Bitmap;)V", 4);
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return new C1282a(2, this.f12122e, H.class, "updateShouldBeDetected", "updateShouldBeDetected(Z)V", 4);
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return new C1282a(2, this.f12122e, H.class, "updateDetectionType", "updateDetectionType(Lcom/buzbuz/smartautoclicker/feature/smart/config/ui/condition/image/DetectionTypeState;)V", 4);
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return new C1282a(2, this.f12122e, H.class, "updateThreshold", "updateThreshold(I)V", 4);
            default:
                return new C1282a(2, this.f12122e, H.class, "updateSaveButton", "updateSaveButton(Z)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f12121d) {
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
        switch (this.f12121d) {
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

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r12 != 3) goto L33;
     */
    @Override // O7.InterfaceC0234g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        int i4;
        int i8 = this.f12121d;
        boolean z8 = true;
        Drawable drawable = null;
        Z5.y yVar = Z5.y.f7506a;
        H h8 = this.f12122e;
        switch (i8) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                h8.getClass();
                if (!booleanValue) {
                    Log.e("ConditionDialog", "Closing ConditionDialog because there is no condition edited");
                    h8.i();
                }
                return yVar;
            case 1:
                String str = (String) obj;
                F3.d dVar = h8.f12022w;
                if (dVar != null) {
                    E2.c.y0((A.i) dVar.f1326h, str, 1);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    F3.d dVar2 = h8.f12022w;
                    if (dVar2 != null) {
                        ((ImageView) dVar2.f1323e).setImageBitmap(bitmap);
                    } else {
                        o6.j.i("viewBinding");
                        throw null;
                    }
                } else {
                    F3.d dVar3 = h8.f12022w;
                    if (dVar3 != null) {
                        ImageView imageView = (ImageView) dVar3.f1323e;
                        Drawable drawable2 = h8.k().getDrawable(R.drawable.ic_cancel);
                        if (drawable2 != null) {
                            drawable2.setTint(-65536);
                            drawable = drawable2;
                        }
                        imageView.setImageDrawable(drawable);
                    } else {
                        o6.j.i("viewBinding");
                        throw null;
                    }
                }
                return yVar;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                F3.d dVar4 = h8.f12022w;
                if (dVar4 != null) {
                    A4.c cVar = (A4.c) dVar4.j;
                    o6.j.b(cVar);
                    E2.b.H(cVar, booleanValue2);
                    E2.b.I(cVar, booleanValue2 ? 1 : 0);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                C0978j c0978j = (C0978j) obj;
                int i9 = c0978j.f12100a;
                if (i9 != 1) {
                    i4 = 2;
                    if (i9 == 2) {
                        i4 = 1;
                    }
                } else {
                    i4 = 0;
                }
                F3.d dVar5 = h8.f12022w;
                if (dVar5 != null) {
                    A4.c cVar2 = (A4.c) dVar5.f1325g;
                    E2.c.n0((A4.a) cVar2.f292f, Integer.valueOf(i4));
                    q4.X.R((A4.c) cVar2.f293g, i4);
                    F3.d dVar6 = h8.f12022w;
                    if (dVar6 != null) {
                        A4.c cVar3 = (A4.c) dVar6.f1327i;
                        if (c0978j.f12100a != 3) {
                            z8 = false;
                        }
                        E2.c.q0(cVar3, z8);
                        E2.c.o0(cVar3, c0978j.f12101b);
                        return yVar;
                    }
                    o6.j.i("viewBinding");
                    throw null;
                }
                o6.j.i("viewBinding");
                throw null;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                int intValue = ((Number) obj).intValue();
                F3.d dVar7 = h8.f12022w;
                if (dVar7 != null) {
                    A4.c cVar4 = (A4.c) dVar7.k;
                    o6.j.d(cVar4, "fieldSliderThreshold");
                    ((Slider) cVar4.f293g).setValue(intValue);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            default:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                F3.d dVar8 = h8.f12022w;
                if (dVar8 != null) {
                    q4.X.P((A4.d) dVar8.f1328l, booleanValue3);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
        }
    }
}
