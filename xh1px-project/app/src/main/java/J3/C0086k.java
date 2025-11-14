package J3;

import L7.AbstractC0166y;
import L7.k0;
import O7.InterfaceC0234g;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.U;
import com.buzbuz.smartautoclicker.R;
import d6.InterfaceC0617c;
import i.C0865d;
import i.DialogInterfaceC0869h;
import kotlin.NoWhenBranchMatchedException;
import o6.C1282a;
import o6.InterfaceC1288g;

/* renamed from: J3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0086k implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2446d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f2447e;

    public /* synthetic */ C0086k(u uVar, int i4) {
        this.f2446d = i4;
        this.f2447e = uVar;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f2446d) {
            case 0:
                return new C1282a(2, this.f2447e, u.class, "updatePlayPauseButtonEnabledState", "updatePlayPauseButtonEnabledState(Z)V", 4);
            case 1:
                return new C1282a(2, this.f2447e, u.class, "updateProjectionErrorBadge", "updateProjectionErrorBadge(Z)V", 4);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return new C1282a(2, this.f2447e, u.class, "updateDetectionState", "updateDetectionState(Lcom/buzbuz/smartautoclicker/feature/smart/config/ui/UiState;)V", 4);
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return new C1282a(2, this.f2447e, u.class, "showNativeLibErrorDialogIfNeeded", "showNativeLibErrorDialogIfNeeded(Z)V", 4);
            default:
                return new C1282a(2, this.f2447e, u.class, "updateDebugOverlayViewVisibility", "updateDebugOverlayViewVisibility(Z)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f2446d) {
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
        switch (this.f2446d) {
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
        k0 k0Var;
        int i4 = this.f2446d;
        int i8 = 8;
        Z5.y yVar = Z5.y.f7506a;
        u uVar = this.f2447e;
        switch (i4) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                F3.m mVar = uVar.f2468M;
                if (mVar != null) {
                    uVar.O((ImageButton) mVar.f1373f, booleanValue, false);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            case 1:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                F3.m mVar2 = uVar.f2468M;
                if (mVar2 != null) {
                    ImageView imageView = (ImageView) mVar2.k;
                    if (!booleanValue2) {
                        i8 = 0;
                    }
                    imageView.setVisibility(i8);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                K k = (K) obj;
                F3.m mVar3 = uVar.f2468M;
                if (mVar3 != null) {
                    Object tag = ((ImageButton) mVar3.f1373f).getTag();
                    if (!o6.j.a(tag, k)) {
                        F3.m mVar4 = uVar.f2468M;
                        if (mVar4 != null) {
                            ((ImageButton) mVar4.f1373f).setTag(k);
                            if (o6.j.a(k, J.f2425a)) {
                                if (tag == null) {
                                    A4.c cVar = uVar.f2469N;
                                    if (cVar != null) {
                                        cVar.k(false);
                                    } else {
                                        o6.j.i("playPauseButtonController");
                                        throw null;
                                    }
                                } else {
                                    uVar.E(new C0076a(uVar, 1));
                                }
                            } else if (o6.j.a(k, I.f2424a)) {
                                if (tag == null) {
                                    A4.c cVar2 = uVar.f2469N;
                                    if (cVar2 != null) {
                                        cVar2.l(false);
                                    } else {
                                        o6.j.i("playPauseButtonController");
                                        throw null;
                                    }
                                } else {
                                    uVar.E(new C0076a(uVar, 2));
                                }
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            o6.j.i("viewBinding");
                            throw null;
                        }
                    }
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                if (((Boolean) obj).booleanValue()) {
                    s5.b bVar = new s5.b(E2.b.u(uVar.k()));
                    bVar.l(R.string.dialog_overlay_title_warning);
                    C0865d c0865d = (C0865d) bVar.f3288e;
                    c0865d.f11665f = c0865d.f11660a.getText(R.string.error_dialog_message_error_native_lib);
                    bVar.k(android.R.string.ok, new DialogInterfaceOnClickListenerC0078c(uVar, 2));
                    DialogInterfaceC0869h c6 = bVar.c();
                    Window window = c6.getWindow();
                    if (window != null) {
                        window.setType(2032);
                    }
                    c6.show();
                }
                return yVar;
            default:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                if (booleanValue3 && uVar.f2470O == null) {
                    F3.m mVar5 = uVar.f2468M;
                    if (mVar5 != null) {
                        ((ConstraintLayout) mVar5.f1377l).setVisibility(0);
                        uVar.f2470O = AbstractC0166y.q(U.e(uVar), null, null, new C0082g(uVar, null), 3);
                    } else {
                        o6.j.i("viewBinding");
                        throw null;
                    }
                } else if (!booleanValue3 && (k0Var = uVar.f2470O) != null) {
                    k0Var.d(null);
                    uVar.f2470O = null;
                    F3.m mVar6 = uVar.f2468M;
                    if (mVar6 != null) {
                        ((TextView) mVar6.j).setText((CharSequence) null);
                        F3.m mVar7 = uVar.f2468M;
                        if (mVar7 != null) {
                            ((TextView) mVar7.f1375h).setText((CharSequence) null);
                            F3.m mVar8 = uVar.f2468M;
                            if (mVar8 != null) {
                                ((TextView) mVar8.f1376i).setText((CharSequence) null);
                                F3.m mVar9 = uVar.f2468M;
                                if (mVar9 != null) {
                                    ((ConstraintLayout) mVar9.f1377l).setVisibility(8);
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
                    } else {
                        o6.j.i("viewBinding");
                        throw null;
                    }
                }
                return yVar;
        }
    }
}
