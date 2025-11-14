package T3;

import O7.InterfaceC0234g;
import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import d6.InterfaceC0617c;
import kotlin.NoWhenBranchMatchedException;
import o.p1;
import o6.C1282a;
import o6.InterfaceC1288g;
import q4.X;

/* renamed from: T3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0319c implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f5715e;

    public /* synthetic */ C0319c(o oVar, int i4) {
        this.f5714d = i4;
        this.f5715e = oVar;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f5714d) {
            case 0:
                return new C1282a(2, this.f5715e, o.class, "onActionEditingStateChanged", "onActionEditingStateChanged(Z)V", 4);
            case 1:
                return new C1282a(2, this.f5715e, o.class, "updateMessageCard", "updateMessageCard(Lcom/buzbuz/smartautoclicker/feature/smart/config/ui/action/notification/UiNotificationMessage;)V", 4);
            default:
                return new C1282a(2, this.f5715e, o.class, "updateSaveButton", "updateSaveButton(Z)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f5714d) {
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
            default:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
        }
    }

    public final int hashCode() {
        switch (this.f5714d) {
            case 0:
                return a().hashCode();
            case 1:
                return a().hashCode();
            default:
                return a().hashCode();
        }
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        int i4 = this.f5714d;
        Z5.y yVar = Z5.y.f7506a;
        o oVar = this.f5715e;
        switch (i4) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                oVar.getClass();
                if (!booleanValue) {
                    Log.e("PauseDialog", "Closing PauseDialog because there is no action edited");
                    oVar.i();
                }
                return yVar;
            case 1:
                I i8 = (I) obj;
                v vVar = i8.f5708a;
                String str = i8.f5709b;
                if (vVar.equals(u.f5745c)) {
                    p1 p1Var = oVar.f5740w;
                    if (p1Var != null) {
                        A.i iVar = (A.i) p1Var.f13353i;
                        TextInputLayout textInputLayout = (TextInputLayout) iVar.f88e;
                        if (textInputLayout.getVisibility() == 8) {
                            textInputLayout.setVisibility(0);
                            E2.c.y0(iVar, str, 1);
                        }
                        p1 p1Var2 = oVar.f5740w;
                        if (p1Var2 != null) {
                            ((ConstraintLayout) ((A4.a) p1Var2.f13352h).f280e).setVisibility(8);
                        } else {
                            o6.j.i("viewBinding");
                            throw null;
                        }
                    } else {
                        o6.j.i("viewBinding");
                        throw null;
                    }
                } else if (vVar.equals(t.f5744c)) {
                    p1 p1Var3 = oVar.f5740w;
                    if (p1Var3 != null) {
                        A4.a aVar = (A4.a) p1Var3.f13352h;
                        ConstraintLayout constraintLayout = (ConstraintLayout) aVar.f280e;
                        if (constraintLayout.getVisibility() == 8) {
                            constraintLayout.setVisibility(0);
                            E2.d.O(aVar, str);
                        }
                        p1 p1Var4 = oVar.f5740w;
                        if (p1Var4 != null) {
                            ((TextInputLayout) ((A.i) p1Var4.f13353i).f88e).setVisibility(8);
                        } else {
                            o6.j.i("viewBinding");
                            throw null;
                        }
                    } else {
                        o6.j.i("viewBinding");
                        throw null;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                p1 p1Var5 = oVar.f5740w;
                if (p1Var5 != null) {
                    D2.f.K((A4.a) p1Var5.f13351g, i8.f5708a);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            default:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                p1 p1Var6 = oVar.f5740w;
                if (p1Var6 != null) {
                    X.P((A4.d) p1Var6.k, booleanValue2);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
        }
    }
}
