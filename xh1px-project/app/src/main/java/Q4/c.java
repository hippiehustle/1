package Q4;

import O7.InterfaceC0234g;
import Z5.y;
import android.graphics.PointF;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.C0512x;
import androidx.lifecycle.EnumC0504o;
import com.buzbuz.smartautoclicker.R;
import com.buzbuz.smartautoclicker.feature.tutorial.ui.game.TutorialGameFragment;
import com.google.android.material.textview.MaterialTextView;
import d6.InterfaceC0617c;
import java.util.Map;
import o6.C1282a;
import o6.InterfaceC1288g;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4862d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TutorialGameFragment f4863e;

    public /* synthetic */ c(TutorialGameFragment tutorialGameFragment, int i4) {
        this.f4862d = i4;
        this.f4863e = tutorialGameFragment;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f4862d) {
            case 0:
                return new C1282a(2, this.f4863e, TutorialGameFragment.class, "onGameUpdated", "onGameUpdated(Lcom/buzbuz/smartautoclicker/feature/tutorial/domain/model/game/TutorialGame;)V", 4);
            case 1:
                return new C1282a(2, this.f4863e, TutorialGameFragment.class, "onGameStartedUpdated", "onGameStartedUpdated(Z)V", 4);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return new C1282a(2, this.f4863e, TutorialGameFragment.class, "onTimerUpdated", "onTimerUpdated(I)V", 4);
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return new C1282a(2, this.f4863e, TutorialGameFragment.class, "onScoreUpdated", "onScoreUpdated(I)V", 4);
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return new C1282a(2, this.f4863e, TutorialGameFragment.class, "onPlayRetryButtonStateUpdated", "onPlayRetryButtonStateUpdated(Z)V", 4);
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return new C1282a(2, this.f4863e, TutorialGameFragment.class, "onTargetsUpdated", "onTargetsUpdated(Ljava/util/Map;)V", 4);
            default:
                return new C1282a(2, this.f4863e, TutorialGameFragment.class, "showHideStepOverlay", "showHideStepOverlay(Z)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f4862d) {
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
        switch (this.f4862d) {
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

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        w1.e eVar;
        C0512x c0512x;
        EnumC0504o enumC0504o;
        int i4 = this.f4862d;
        y yVar = y.f7506a;
        TutorialGameFragment tutorialGameFragment = this.f4863e;
        switch (i4) {
            case 0:
                N4.a aVar = (N4.a) obj;
                if (aVar != null) {
                    J4.a aVar2 = tutorialGameFragment.f9838i0;
                    if (aVar2 != null) {
                        aVar2.f2489l.setText(aVar.f3760a);
                        aVar2.k.setText(aVar2.f2483d.getContext().getString(R.string.message_high_score, Integer.valueOf(aVar.f3761b)));
                    } else {
                        o6.j.i("viewBinding");
                        throw null;
                    }
                }
                return yVar;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    J4.a aVar3 = tutorialGameFragment.f9838i0;
                    if (aVar3 != null) {
                        ((MaterialTextView) aVar3.f2486g.f89f).startAnimation(AnimationUtils.loadAnimation(tutorialGameFragment.O(), R.anim.anim_timer_blink));
                    } else {
                        o6.j.i("viewBinding");
                        throw null;
                    }
                } else {
                    J4.a aVar4 = tutorialGameFragment.f9838i0;
                    if (aVar4 != null) {
                        ((MaterialTextView) aVar4.f2486g.f89f).clearAnimation();
                    } else {
                        o6.j.i("viewBinding");
                        throw null;
                    }
                }
                return yVar;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                int intValue = ((Number) obj).intValue();
                J4.a aVar5 = tutorialGameFragment.f9838i0;
                if (aVar5 != null) {
                    ((MaterialTextView) aVar5.f2486g.f89f).setText(tutorialGameFragment.O().getString(R.string.message_time_left, Integer.valueOf(intValue)));
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                int intValue2 = ((Number) obj).intValue();
                J4.a aVar6 = tutorialGameFragment.f9838i0;
                if (aVar6 != null) {
                    aVar6.f2490m.setText(tutorialGameFragment.O().getString(R.string.message_score, Integer.valueOf(intValue2)));
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                if (((Boolean) obj).booleanValue()) {
                    J4.a aVar7 = tutorialGameFragment.f9838i0;
                    if (aVar7 != null) {
                        aVar7.f2485f.setVisibility(0);
                        J4.a aVar8 = tutorialGameFragment.f9838i0;
                        if (aVar8 != null) {
                            aVar8.f2484e.setVisibility(8);
                            J4.a aVar9 = tutorialGameFragment.f9838i0;
                            if (aVar9 != null) {
                                aVar9.f2488i.setVisibility(8);
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
                    J4.a aVar10 = tutorialGameFragment.f9838i0;
                    if (aVar10 != null) {
                        aVar10.f2485f.setVisibility(8);
                    } else {
                        o6.j.i("viewBinding");
                        throw null;
                    }
                }
                return yVar;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                Map map = (Map) obj;
                J4.a aVar11 = tutorialGameFragment.f9838i0;
                if (aVar11 != null) {
                    AppCompatImageView appCompatImageView = aVar11.f2484e;
                    PointF pointF = (PointF) map.get(N4.d.f3771d);
                    if (pointF == null) {
                        appCompatImageView.setVisibility(8);
                    } else {
                        appCompatImageView.setVisibility(0);
                        appCompatImageView.setX(pointF.x);
                        appCompatImageView.setY(pointF.y);
                    }
                    J4.a aVar12 = tutorialGameFragment.f9838i0;
                    if (aVar12 != null) {
                        AppCompatImageView appCompatImageView2 = aVar12.f2488i;
                        PointF pointF2 = (PointF) map.get(N4.d.f3772e);
                        if (pointF2 == null) {
                            appCompatImageView2.setVisibility(8);
                        } else {
                            appCompatImageView2.setVisibility(0);
                            appCompatImageView2.setX(pointF2.x);
                            appCompatImageView2.setY(pointF2.y);
                        }
                        J4.a aVar13 = tutorialGameFragment.f9838i0;
                        if (aVar13 != null) {
                            aVar13.f2487h.forceLayout();
                            return yVar;
                        }
                        o6.j.i("viewBinding");
                        throw null;
                    }
                    o6.j.i("viewBinding");
                    throw null;
                }
                o6.j.i("viewBinding");
                throw null;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                w1.e eVar2 = (w1.e) tutorialGameFragment.S().f575d.h();
                if (eVar2 != null && (c0512x = eVar2.j) != null && (enumC0504o = c0512x.f8862d) != null && enumC0504o.compareTo(EnumC0504o.f8849g) >= 0) {
                    J4.a aVar14 = tutorialGameFragment.f9838i0;
                    if (aVar14 != null) {
                        aVar14.j.setVisibility(4);
                    } else {
                        o6.j.i("viewBinding");
                        throw null;
                    }
                } else {
                    J4.a aVar15 = tutorialGameFragment.f9838i0;
                    if (aVar15 != null) {
                        aVar15.j.setVisibility(0);
                    } else {
                        o6.j.i("viewBinding");
                        throw null;
                    }
                }
                C1.g S8 = tutorialGameFragment.S();
                if (booleanValue) {
                    S4.h hVar = new S4.h();
                    if (S8.f579h == null && (eVar = (w1.e) S8.f575d.h()) != null) {
                        eVar.hashCode();
                        hVar.c(eVar.k(), new C1.b(0, S8));
                        hVar.z();
                        S8.f579h = hVar;
                    }
                } else {
                    S4.h hVar2 = S8.f579h;
                    if (hVar2 != null) {
                        hVar2.i();
                    }
                    S8.f579h = null;
                }
                return yVar;
        }
    }
}
