package S4;

import A.p;
import D4.z;
import J3.s;
import L7.AbstractC0166y;
import a6.AbstractC0437l;
import android.animation.ValueAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.lifecycle.U;
import com.buzbuz.smartautoclicker.R;
import com.buzbuz.smartautoclicker.feature.tutorial.ui.overlay.TutorialFullscreenView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.textview.MaterialTextView;
import h7.AbstractC0842e;
import o6.v;

/* loaded from: classes.dex */
public final class h extends w1.e {

    /* renamed from: p, reason: collision with root package name */
    public final WindowManager.LayoutParams f5375p;

    /* renamed from: q, reason: collision with root package name */
    public WindowManager f5376q;

    /* renamed from: r, reason: collision with root package name */
    public ConstraintLayout f5377r;

    /* renamed from: s, reason: collision with root package name */
    public final ValueAnimator f5378s;

    /* renamed from: t, reason: collision with root package name */
    public final A4.d f5379t;

    /* renamed from: u, reason: collision with root package name */
    public A4.d f5380u;

    /* renamed from: v, reason: collision with root package name */
    public F3.a f5381v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h() {
        super(Integer.valueOf(R.style.AppTheme), false);
        int i4 = 0;
        this.f5375p = new WindowManager.LayoutParams(-1, -1, 2032, 262920, -3);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new I1.a(i4, this));
        this.f5378s = ofFloat;
        this.f5379t = new A4.d(v.f13643a.b(k.class), new g(this, i4), new g(this, 1), new z(18, this));
    }

    public final void D(m mVar) {
        F3.a aVar = this.f5381v;
        if (aVar != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) aVar.f1308i;
            MaterialTextView materialTextView = (MaterialTextView) aVar.j;
            int i4 = mVar.f5394a;
            l lVar = mVar.f5395b;
            materialTextView.setText(i4);
            if (lVar != null) {
                constraintLayout.setVisibility(0);
                ((AppCompatImageView) aVar.f1307h).setImageResource(lVar.f5392a);
                ((MaterialTextView) aVar.f1305f).setText(lVar.f5393b);
            } else {
                constraintLayout.setVisibility(8);
            }
            A4.d dVar = this.f5380u;
            if (dVar != null) {
                ConstraintLayout constraintLayout2 = (ConstraintLayout) dVar.f295e;
                o6.j.d(constraintLayout2, "getRoot(...)");
                F3.a aVar2 = this.f5381v;
                if (aVar2 != null) {
                    MaterialCardView materialCardView = (MaterialCardView) aVar2.f1304e;
                    o6.j.d(materialCardView, "getRoot(...)");
                    if (constraintLayout2.indexOfChild(materialCardView) == -1) {
                        int dimensionPixelSize = k().getResources().getDimensionPixelSize(R.dimen.tutorial_instructions_horizontal_margin);
                        A4.d dVar2 = this.f5380u;
                        if (dVar2 != null) {
                            ConstraintLayout constraintLayout3 = (ConstraintLayout) dVar2.f295e;
                            F3.a aVar3 = this.f5381v;
                            if (aVar3 != null) {
                                MaterialCardView materialCardView2 = (MaterialCardView) aVar3.f1304e;
                                A.e eVar = new A.e(-1);
                                eVar.setMargins(dimensionPixelSize, 0, dimensionPixelSize, 0);
                                constraintLayout3.addView(materialCardView2, eVar);
                            } else {
                                o6.j.i("instructionsViewBinding");
                                throw null;
                            }
                        } else {
                            o6.j.i("viewBinding");
                            throw null;
                        }
                    }
                    if (mVar.f5397d) {
                        p pVar = new p();
                        A4.d dVar3 = this.f5380u;
                        if (dVar3 != null) {
                            pVar.b((ConstraintLayout) dVar3.f295e);
                            F3.a aVar4 = this.f5381v;
                            if (aVar4 != null) {
                                int id = ((MaterialCardView) aVar4.f1306g).getId();
                                A4.d dVar4 = this.f5380u;
                                if (dVar4 != null) {
                                    pVar.c(id, 3, ((MaterialButton) dVar4.f297g).getId(), 4);
                                    F3.a aVar5 = this.f5381v;
                                    if (aVar5 != null) {
                                        int id2 = ((MaterialCardView) aVar5.f1306g).getId();
                                        A4.d dVar5 = this.f5380u;
                                        if (dVar5 != null) {
                                            pVar.c(id2, 4, ((Guideline) dVar5.f298h).getId(), 3);
                                            F3.a aVar6 = this.f5381v;
                                            if (aVar6 != null) {
                                                int id3 = ((MaterialCardView) aVar6.f1306g).getId();
                                                pVar.c(id3, 6, 0, 6);
                                                pVar.c(id3, 7, 0, 7);
                                                A4.d dVar6 = this.f5380u;
                                                if (dVar6 != null) {
                                                    ConstraintLayout constraintLayout4 = (ConstraintLayout) dVar6.f295e;
                                                    pVar.a(constraintLayout4);
                                                    constraintLayout4.setConstraintSet(null);
                                                    constraintLayout4.requestLayout();
                                                    return;
                                                }
                                                o6.j.i("viewBinding");
                                                throw null;
                                            }
                                            o6.j.i("instructionsViewBinding");
                                            throw null;
                                        }
                                        o6.j.i("viewBinding");
                                        throw null;
                                    }
                                    o6.j.i("instructionsViewBinding");
                                    throw null;
                                }
                                o6.j.i("viewBinding");
                                throw null;
                            }
                            o6.j.i("instructionsViewBinding");
                            throw null;
                        }
                        o6.j.i("viewBinding");
                        throw null;
                    }
                    p pVar2 = new p();
                    A4.d dVar7 = this.f5380u;
                    if (dVar7 != null) {
                        pVar2.b((ConstraintLayout) dVar7.f295e);
                        F3.a aVar7 = this.f5381v;
                        if (aVar7 != null) {
                            int id4 = ((MaterialCardView) aVar7.f1306g).getId();
                            A4.d dVar8 = this.f5380u;
                            if (dVar8 != null) {
                                pVar2.c(id4, 3, ((Guideline) dVar8.f298h).getId(), 4);
                                F3.a aVar8 = this.f5381v;
                                if (aVar8 != null) {
                                    pVar2.c(((MaterialCardView) aVar8.f1306g).getId(), 4, 0, 4);
                                    F3.a aVar9 = this.f5381v;
                                    if (aVar9 != null) {
                                        int id5 = ((MaterialCardView) aVar9.f1306g).getId();
                                        pVar2.c(id5, 6, 0, 6);
                                        pVar2.c(id5, 7, 0, 7);
                                        A4.d dVar9 = this.f5380u;
                                        if (dVar9 != null) {
                                            ConstraintLayout constraintLayout5 = (ConstraintLayout) dVar9.f295e;
                                            pVar2.a(constraintLayout5);
                                            constraintLayout5.setConstraintSet(null);
                                            constraintLayout5.requestLayout();
                                            return;
                                        }
                                        o6.j.i("viewBinding");
                                        throw null;
                                    }
                                    o6.j.i("instructionsViewBinding");
                                    throw null;
                                }
                                o6.j.i("instructionsViewBinding");
                                throw null;
                            }
                            o6.j.i("viewBinding");
                            throw null;
                        }
                        o6.j.i("instructionsViewBinding");
                        throw null;
                    }
                    o6.j.i("viewBinding");
                    throw null;
                }
                o6.j.i("instructionsViewBinding");
                throw null;
            }
            o6.j.i("viewBinding");
            throw null;
        }
        o6.j.i("instructionsViewBinding");
        throw null;
    }

    @Override // w1.e
    public final void p() {
        Object systemService = k().getSystemService((Class<Object>) WindowManager.class);
        o6.j.d(systemService, "getSystemService(...)");
        this.f5376q = (WindowManager) systemService;
        Object systemService2 = k().getSystemService((Class<Object>) LayoutInflater.class);
        o6.j.d(systemService2, "getSystemService(...)");
        LayoutInflater layoutInflater = (LayoutInflater) systemService2;
        View inflate = layoutInflater.inflate(R.layout.overlay_tutorial, (ViewGroup) null, false);
        int i4 = R.id.button_next;
        MaterialButton materialButton = (MaterialButton) E2.b.r(inflate, R.id.button_next);
        if (materialButton != null) {
            i4 = R.id.button_skip_all;
            MaterialButton materialButton2 = (MaterialButton) E2.b.r(inflate, R.id.button_skip_all);
            if (materialButton2 != null) {
                i4 = R.id.guideline_vertical_center;
                Guideline guideline = (Guideline) E2.b.r(inflate, R.id.guideline_vertical_center);
                if (guideline != null) {
                    i4 = R.id.tutorial_background;
                    TutorialFullscreenView tutorialFullscreenView = (TutorialFullscreenView) E2.b.r(inflate, R.id.tutorial_background);
                    if (tutorialFullscreenView != null) {
                        A4.d dVar = new A4.d((ConstraintLayout) inflate, materialButton, materialButton2, guideline, tutorialFullscreenView, 7);
                        final int i8 = 0;
                        materialButton2.setOnClickListener(new View.OnClickListener(this) { // from class: S4.c

                            /* renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ h f5366e;

                            {
                                this.f5366e = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i8) {
                                    case 0:
                                        h hVar = this.f5366e;
                                        hVar.o().g();
                                        F4.j jVar = ((k) hVar.f5379t.getValue()).f5389c.f2922e;
                                        F4.h hVar2 = (F4.h) jVar.f1391d.f();
                                        if (hVar2 != null) {
                                            jVar.a(AbstractC0437l.W(hVar2.f1386c));
                                            return;
                                        }
                                        return;
                                    default:
                                        ((k) this.f5366e.f5379t.getValue()).f5389c.a();
                                        return;
                                }
                            }
                        });
                        final int i9 = 1;
                        materialButton.setOnClickListener(new View.OnClickListener(this) { // from class: S4.c

                            /* renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ h f5366e;

                            {
                                this.f5366e = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i9) {
                                    case 0:
                                        h hVar = this.f5366e;
                                        hVar.o().g();
                                        F4.j jVar = ((k) hVar.f5379t.getValue()).f5389c.f2922e;
                                        F4.h hVar2 = (F4.h) jVar.f1391d.f();
                                        if (hVar2 != null) {
                                            jVar.a(AbstractC0437l.W(hVar2.f1386c));
                                            return;
                                        }
                                        return;
                                    default:
                                        ((k) this.f5366e.f5379t.getValue()).f5389c.a();
                                        return;
                                }
                            }
                        });
                        tutorialFullscreenView.setOnMonitoredViewClickedListener(new s(0, (k) this.f5379t.getValue(), k.class, "toNextTutorialStep", "toNextTutorialStep()V", 0, 0, 1));
                        this.f5380u = dVar;
                        View inflate2 = layoutInflater.inflate(R.layout.include_tutorial_instructions, (ViewGroup) null, false);
                        MaterialCardView materialCardView = (MaterialCardView) inflate2;
                        int i10 = R.id.divider;
                        if (((MaterialDivider) E2.b.r(inflate2, R.id.divider)) != null) {
                            i10 = R.id.image_instructions;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) E2.b.r(inflate2, R.id.image_instructions);
                            if (appCompatImageView != null) {
                                i10 = R.id.layout_image_instructions;
                                ConstraintLayout constraintLayout = (ConstraintLayout) E2.b.r(inflate2, R.id.layout_image_instructions);
                                if (constraintLayout != null) {
                                    i10 = R.id.text_image_instructions_description;
                                    MaterialTextView materialTextView = (MaterialTextView) E2.b.r(inflate2, R.id.text_image_instructions_description);
                                    if (materialTextView != null) {
                                        i10 = R.id.text_instructions;
                                        MaterialTextView materialTextView2 = (MaterialTextView) E2.b.r(inflate2, R.id.text_instructions);
                                        if (materialTextView2 != null) {
                                            this.f5381v = new F3.a(materialCardView, materialCardView, appCompatImageView, constraintLayout, materialTextView, materialTextView2, 4);
                                            A4.d dVar2 = this.f5380u;
                                            if (dVar2 != null) {
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) dVar2.f295e;
                                                o6.j.d(constraintLayout2, "getRoot(...)");
                                                this.f5377r = constraintLayout2;
                                                AbstractC0166y.q(U.e(this), null, null, new f(this, null), 3);
                                                return;
                                            }
                                            o6.j.i("viewBinding");
                                            throw null;
                                        }
                                    }
                                }
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i10)));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // w1.e
    public final void v() {
        ConstraintLayout constraintLayout = this.f5377r;
        if (constraintLayout != null) {
            constraintLayout.setAlpha(0.0f);
            WindowManager windowManager = this.f5376q;
            if (windowManager != null) {
                ConstraintLayout constraintLayout2 = this.f5377r;
                if (constraintLayout2 != null) {
                    if (AbstractC0842e.y(windowManager, constraintLayout2, this.f5375p)) {
                        this.f5378s.start();
                        return;
                    } else {
                        i();
                        return;
                    }
                }
                o6.j.i("view");
                throw null;
            }
            o6.j.i("windowManager");
            throw null;
        }
        o6.j.i("view");
        throw null;
    }

    @Override // w1.e
    public final void w() {
        WindowManager windowManager = this.f5376q;
        if (windowManager != null) {
            ConstraintLayout constraintLayout = this.f5377r;
            if (constraintLayout != null) {
                windowManager.removeView(constraintLayout);
                return;
            } else {
                o6.j.i("view");
                throw null;
            }
        }
        o6.j.i("windowManager");
        throw null;
    }
}
