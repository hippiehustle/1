package M3;

import O7.InterfaceC0234g;
import android.graphics.Bitmap;
import android.util.Log;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import d6.InterfaceC0617c;
import kotlin.NoWhenBranchMatchedException;
import o.p1;
import o6.C1282a;
import o6.InterfaceC1288g;

/* renamed from: M3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0170c implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3430d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0183p f3431e;

    public /* synthetic */ C0170c(C0183p c0183p, int i4) {
        this.f3430d = i4;
        this.f3431e = c0183p;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f3430d) {
            case 0:
                return new C1282a(2, this.f3431e, C0183p.class, "onActionEditingStateChanged", "onActionEditingStateChanged(Z)V", 4);
            case 1:
                return new C1282a(2, this.f3431e, C0183p.class, "updateClickName", "updateClickName(Ljava/lang/String;)V", 4);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return new C1282a(2, this.f3431e, C0183p.class, "updateClickDuration", "updateClickDuration(Ljava/lang/String;)V", 4);
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return new C1282a(2, this.f3431e, C0183p.class, "updateClickPositionUiState", "updateClickPositionUiState(Lcom/buzbuz/smartautoclicker/feature/smart/config/ui/action/click/ClickPositionUiState;)V", 4);
            default:
                return new C1282a(2, this.f3431e, C0183p.class, "updateSaveButton", "updateSaveButton(Z)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f3430d) {
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
            default:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
        }
    }

    public final int hashCode() {
        switch (this.f3430d) {
            case 0:
                return a().hashCode();
            case 1:
                return a().hashCode();
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return a().hashCode();
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return a().hashCode();
            default:
                return a().hashCode();
        }
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        int i4;
        int i8;
        int i9;
        int i10 = this.f3430d;
        Z5.y yVar = Z5.y.f7506a;
        C0183p c0183p = this.f3431e;
        switch (i10) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                c0183p.getClass();
                if (!booleanValue) {
                    Log.e("ClickDialog", "Closing ClickDialog because there is no action edited");
                    c0183p.i();
                }
                return yVar;
            case 1:
                String str = (String) obj;
                p1 p1Var = c0183p.f3458w;
                if (p1Var != null) {
                    E2.c.y0((A.i) p1Var.f13353i, str, 1);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                String str2 = (String) obj;
                p1 p1Var2 = c0183p.f3458w;
                if (p1Var2 != null) {
                    A.i iVar = (A.i) p1Var2.j;
                    o6.j.d(iVar, "fieldPressDuration");
                    E2.c.y0(iVar, str2, 2);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                I i11 = (I) obj;
                if (i11 != null) {
                    f2.d dVar = i11.f3361a;
                    p1 p1Var3 = c0183p.f3458w;
                    if (p1Var3 != null) {
                        A4.c cVar = (A4.c) p1Var3.f13352h;
                        int i12 = 0;
                        if (dVar == f2.d.f10687d) {
                            i4 = 0;
                        } else {
                            i4 = 1;
                        }
                        E2.c.n0((A4.a) cVar.f292f, Integer.valueOf(i4));
                        q4.X.R((A4.c) cVar.f293g, i4);
                        ConstraintLayout constraintLayout = (ConstraintLayout) cVar.f291e;
                        if (i11.f3362b) {
                            i8 = 0;
                        } else {
                            i8 = 8;
                        }
                        constraintLayout.setVisibility(i8);
                        p1 p1Var4 = c0183p.f3458w;
                        if (p1Var4 != null) {
                            A4.c cVar2 = (A4.c) p1Var4.f13351g;
                            E2.c.A0(cVar2, i11.f3367g);
                            E2.c.o0(cVar2, i11.f3368h);
                            E2.c.q0(cVar2, i11.f3366f);
                            Bitmap bitmap = i11.f3369i;
                            ImageView imageView = (ImageView) cVar2.f292f;
                            if (bitmap == null) {
                                i9 = 8;
                            } else {
                                i9 = 0;
                            }
                            imageView.setVisibility(i9);
                            imageView.setImageBitmap(bitmap);
                            int ordinal = dVar.ordinal();
                            if (ordinal != 0) {
                                if (ordinal == 1) {
                                    E2.c.w0(cVar2, new C0168a(c0183p, 3));
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                E2.c.w0(cVar2, new C0168a(c0183p, i12));
                            }
                            p1 p1Var5 = c0183p.f3458w;
                            if (p1Var5 != null) {
                                A4.c cVar3 = (A4.c) p1Var5.f13350f;
                                E2.c.q0(cVar3, i11.f3364d);
                                E2.c.o0(cVar3, i11.f3365e);
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) cVar3.f291e;
                                if (!i11.f3363c) {
                                    i12 = 8;
                                }
                                constraintLayout2.setVisibility(i12);
                            } else {
                                o6.j.i("viewBinding");
                                throw null;
                            }
                        } else {
                            o6.j.i("viewBinding");
                            throw null;
                        }
                    } else {
                        o6.j.i("viewBinding");
                        throw null;
                    }
                }
                return yVar;
            default:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                p1 p1Var6 = c0183p.f3458w;
                if (p1Var6 != null) {
                    q4.X.P((A4.d) p1Var6.k, booleanValue2);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
        }
    }
}
