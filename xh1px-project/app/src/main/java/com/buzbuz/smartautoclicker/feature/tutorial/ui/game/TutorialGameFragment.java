package com.buzbuz.smartautoclicker.feature.tutorial.ui.game;

import A4.d;
import F4.i;
import F4.k;
import F4.u;
import H4.c;
import J4.a;
import L7.AbstractC0166y;
import M1.e;
import Q4.l;
import Q4.m;
import Q4.n;
import Q4.t;
import V5.f;
import V5.j;
import X5.b;
import Z.g;
import Z5.h;
import a.AbstractC0405a;
import a6.AbstractC0437l;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.U;
import androidx.lifecycle.b0;
import c1.C0563d;
import com.buzbuz.smartautoclicker.R;
import com.buzbuz.smartautoclicker.feature.tutorial.ui.game.TutorialGameFragment;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import g0.AbstractComponentCallbacksC0755y;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import n6.InterfaceC1163b;
import o6.v;
import o6.w;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/buzbuz/smartautoclicker/feature/tutorial/ui/game/TutorialGameFragment;", "Lg0/y;", "<init>", "()V", "tutorial_fDroidRelease"}, k = 1, mv = {g.FLOAT_FIELD_NUMBER, g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TutorialGameFragment extends AbstractComponentCallbacksC0755y implements b {

    /* renamed from: c0, reason: collision with root package name */
    public j f9832c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f9833d0;

    /* renamed from: e0, reason: collision with root package name */
    public volatile f f9834e0;

    /* renamed from: f0, reason: collision with root package name */
    public final Object f9835f0 = new Object();

    /* renamed from: g0, reason: collision with root package name */
    public boolean f9836g0 = false;

    /* renamed from: h0, reason: collision with root package name */
    public final d f9837h0;

    /* renamed from: i0, reason: collision with root package name */
    public a f9838i0;
    public final R.g j0;

    /* renamed from: k0, reason: collision with root package name */
    public C1.g f9839k0;

    public TutorialGameFragment() {
        Z5.g c6 = Z5.a.c(h.f7483e, new e(3, new e(2, this)));
        w wVar = v.f13643a;
        this.f9837h0 = new d(wVar.b(t.class), new M1.f(c6, 2), new M1.g(this, c6, 1), new M1.f(c6, 3));
        this.j0 = new R.g(wVar.b(m.class), new B6.j(8, this));
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final LayoutInflater B(Bundle bundle) {
        LayoutInflater B8 = super.B(bundle);
        return B8.cloneInContext(new j(B8, this));
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final void H(View view) {
        int i4;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        o6.j.e(view, "view");
        int[] iArr = new int[2];
        a aVar = this.f9838i0;
        if (aVar != null) {
            aVar.j.getLocationInWindow(iArr);
            C1.g S8 = S();
            a aVar2 = this.f9838i0;
            if (aVar2 != null) {
                ViewGroup.LayoutParams layoutParams = aVar2.j.getLayoutParams();
                int i8 = 0;
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    i4 = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
                } else {
                    i4 = 0;
                }
                int i9 = i4 + iArr[0];
                a aVar3 = this.f9838i0;
                if (aVar3 != null) {
                    ViewGroup.LayoutParams layoutParams2 = aVar3.j.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    } else {
                        marginLayoutParams = null;
                    }
                    if (marginLayoutParams != null) {
                        i8 = marginLayoutParams.topMargin;
                    }
                    Point point = new Point(i9, i8 + iArr[1]);
                    point.toString();
                    H1.b bVar = S8.f573b;
                    bVar.getClass();
                    if (bVar.f1884c == null) {
                        Iterator it = bVar.f1883b.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC1163b) it.next()).m(point);
                        }
                        bVar.f1884c = point;
                    }
                    S().b();
                    final a aVar4 = this.f9838i0;
                    if (aVar4 != null) {
                        final int i10 = 0;
                        aVar4.f2484e.setOnClickListener(new View.OnClickListener(this) { // from class: Q4.a

                            /* renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ TutorialGameFragment f4858e;

                            {
                                this.f4858e = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i10) {
                                    case 0:
                                        this.f4858e.T().e(N4.d.f3771d);
                                        return;
                                    default:
                                        this.f4858e.T().e(N4.d.f3772e);
                                        return;
                                }
                            }
                        });
                        final int i11 = 1;
                        aVar4.f2488i.setOnClickListener(new View.OnClickListener(this) { // from class: Q4.a

                            /* renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ TutorialGameFragment f4858e;

                            {
                                this.f4858e = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i11) {
                                    case 0:
                                        this.f4858e.T().e(N4.d.f3771d);
                                        return;
                                    default:
                                        this.f4858e.T().e(N4.d.f3772e);
                                        return;
                                }
                            }
                        });
                        final int dimensionPixelSize = aVar4.f2483d.getContext().getResources().getDimensionPixelSize(R.dimen.tutorial_game_target_size);
                        aVar4.f2485f.setOnClickListener(new View.OnClickListener() { // from class: Q4.b
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                t T5 = TutorialGameFragment.this.T();
                                MaterialCardView materialCardView = aVar4.f2487h;
                                Rect rect = new Rect(0, 0, materialCardView.getWidth(), materialCardView.getHeight());
                                L4.j jVar = T5.f4897b;
                                jVar.getClass();
                                F4.j jVar2 = jVar.f2922e;
                                jVar2.getClass();
                                rect.toString();
                                F4.h hVar = (F4.h) jVar2.f1391d.f();
                                if (hVar != null) {
                                    G4.a aVar5 = hVar.f1385b;
                                    Q7.d dVar = jVar2.f1390c;
                                    A1.h hVar2 = new A1.h(6, jVar2);
                                    aVar5.getClass();
                                    o6.j.e(dVar, "coroutineScope");
                                    H4.c cVar = aVar5.f1741b;
                                    if (!((Boolean) cVar.f2008b.f()).booleanValue()) {
                                        cVar.f2015i = AbstractC0166y.q(dVar, null, null, new H4.b(cVar, rect, dimensionPixelSize, hVar2, null), 3);
                                    }
                                }
                            }
                        });
                        AbstractC0166y.q(U.e(this), null, null, new l(this, null), 3);
                        return;
                    }
                    o6.j.i("viewBinding");
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
    }

    public final C1.g S() {
        C1.g gVar = this.f9839k0;
        if (gVar != null) {
            return gVar;
        }
        o6.j.i("overlayManager");
        throw null;
    }

    public final t T() {
        return (t) this.f9837h0.getValue();
    }

    public final void U() {
        if (this.f9832c0 == null) {
            this.f9832c0 = new j(super.j(), this);
            this.f9833d0 = AbstractC0405a.b0(super.j());
        }
    }

    public final void V() {
        if (!this.f9836g0) {
            this.f9836g0 = true;
            this.f9839k0 = (C1.g) ((C0563d) ((n) a())).f9441a.f9473f.get();
        }
    }

    @Override // X5.b
    public final Object a() {
        if (this.f9834e0 == null) {
            synchronized (this.f9835f0) {
                try {
                    if (this.f9834e0 == null) {
                        this.f9834e0 = new f(this);
                    }
                } finally {
                }
            }
        }
        return this.f9834e0.a();
    }

    @Override // g0.AbstractComponentCallbacksC0755y, androidx.lifecycle.InterfaceC0499j
    public final b0 d() {
        return E2.d.v(this, super.d());
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final Context j() {
        if (super.j() == null && !this.f9833d0) {
            return null;
        }
        U();
        return this.f9832c0;
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final void u(Activity activity) {
        boolean z8 = true;
        this.f11093I = true;
        j jVar = this.f9832c0;
        if (jVar != null && f.c(jVar) != activity) {
            z8 = false;
        }
        E2.b.h(z8, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        U();
        V();
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final void v(Context context) {
        super.v(context);
        U();
        V();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x05a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x05a4  */
    /* JADX WARN: Type inference failed for: r15v2, types: [d6.h, L7.w, d6.c] */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v7 */
    @Override // g0.AbstractComponentCallbacksC0755y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(Bundle bundle) {
        L4.j jVar;
        int i4;
        F4.h hVar;
        int i8;
        F4.h hVar2;
        ?? r15;
        super.w(bundle);
        t T5 = T();
        int i9 = ((m) this.j0.getValue()).f4882a;
        L4.j jVar2 = T5.f4897b;
        i iVar = jVar2.f2920c;
        if (jVar2.f2922e.f1391d.f() != null) {
            return;
        }
        if (jVar2.f2925h == null) {
            Log.e("TutorialRepository", "Tutorial mode is not setup, can't start tutorial " + i9);
            return;
        }
        if (i9 >= 0 && i9 < iVar.f1387a.size()) {
            List list = iVar.f1387a;
            if (i9 < 0 || i9 > AbstractC0437l.W(list)) {
                jVar = jVar2;
                i4 = i9;
                hVar = null;
                i8 = 3;
            } else {
                k kVar = (k) list.get(i9);
                k kVar2 = I4.a.f2097b;
                boolean a3 = o6.j.a(kVar, kVar2);
                J2.a aVar = J2.a.f2381w;
                J2.a aVar2 = J2.a.f2368h;
                J2.a aVar3 = J2.a.j;
                i8 = 3;
                int i10 = 1;
                J2.a aVar4 = J2.a.f2374p;
                int i11 = 10;
                J2.a aVar5 = J2.a.f2383y;
                J2.a aVar6 = J2.a.f2376r;
                int i12 = 0;
                J2.a aVar7 = J2.a.f2367g;
                J2.a aVar8 = J2.a.f2377s;
                J2.a aVar9 = J2.a.f2375q;
                J2.a aVar10 = J2.a.f2370l;
                J2.a aVar11 = J2.a.f2378t;
                J2.a aVar12 = J2.a.f2380v;
                i4 = i9;
                F4.d dVar = F4.d.f1381f;
                jVar = jVar2;
                F4.g gVar = F4.g.f1383f;
                F4.b bVar = F4.b.f1379e;
                F4.e eVar = F4.e.f1382f;
                if (a3) {
                    hVar2 = new F4.h(kVar2, new G4.a(R.string.message_tutorial_1_game_instructions, new c(100)), AbstractC0437l.X(new u(R.string.message_tutorial_1_step_1, null, eVar, bVar), new Object(), new u(R.string.message_tutorial_1_step_3, null, eVar, new F4.a(aVar12)), new u(R.string.message_tutorial_1_step_4, null, gVar, new F4.a(J2.a.f2382x)), new u(R.string.message_tutorial_1_step_5, null, gVar, new F4.a(aVar11)), new u(R.string.message_tutorial_1_step_6, null, gVar, new F4.a(aVar4)), new u(R.string.message_tutorial_1_step_7, new F4.w(R.drawable.ic_capture, R.string.message_tutorial_1_step_secondary_7), gVar, bVar), new u(R.string.message_tutorial_1_step_8, new F4.w(R.drawable.ic_cancel, R.string.message_tutorial_1_step_secondary_8), new F4.f(), bVar), new u(R.string.message_tutorial_1_step_9, new F4.w(R.drawable.tutorial_instructions_capture_sizing, R.string.message_tutorial_1_step_secondary_9), eVar, bVar), new u(R.string.message_tutorial_1_step_10, null, gVar, new F4.a(aVar10)), new u(R.string.message_tutorial_1_step_11, null, gVar, new F4.a(aVar9)), new u(R.string.message_tutorial_1_step_12, null, gVar, new F4.a(aVar8)), new u(R.string.message_tutorial_1_step_13, null, gVar, new F4.a(J2.a.f2366f)), new u(R.string.message_tutorial_1_step_14, null, gVar, new F4.a(J2.a.f2364d)), new u(R.string.message_tutorial_1_step_15, null, gVar, new F4.a(aVar3)), new u(R.string.message_tutorial_1_step_16, new F4.w(R.drawable.ic_visible_on, R.string.message_tutorial_1_step_secondary_16), gVar, bVar), new u(R.string.message_tutorial_1_step_17, null, gVar, new F4.a(aVar2)), new u(R.string.message_tutorial_1_step_18, null, gVar, new F4.a(aVar7)), new u(R.string.message_tutorial_1_step_19, null, gVar, new F4.a(aVar6)), new u(R.string.message_tutorial_1_step_20, null, gVar, new F4.a(aVar5)), new u(R.string.message_tutorial_1_step_21, null, gVar, new F4.a(aVar)), new u(R.string.message_tutorial_1_step_22, null, eVar, bVar), new u(R.string.message_tutorial_1_step_23, null, dVar, bVar)));
                } else {
                    k kVar3 = I4.a.f2096a;
                    boolean a4 = o6.j.a(kVar, kVar3);
                    J2.a aVar13 = J2.a.f2384z;
                    if (a4) {
                        hVar2 = new F4.h(kVar3, new G4.a(R.string.message_tutorial_2_game_instructions, new H4.f()), AbstractC0437l.X(new u(R.string.message_tutorial_2_step_1, null, eVar, bVar), new Object(), new u(R.string.message_tutorial_2_step_3, null, eVar, new F4.a(aVar12)), new u(R.string.message_tutorial_2_step_4, null, gVar, new F4.a(aVar13)), new u(R.string.message_tutorial_2_step_5, null, gVar, new F4.a(aVar11)), new u(R.string.message_tutorial_2_step_6, null, gVar, new F4.a(J2.a.f2373o)), new u(R.string.message_tutorial_2_step_7, new F4.w(R.drawable.ic_warning, R.string.message_tutorial_2_step_secondary_7), gVar, new F4.a(J2.a.f2371m)), new u(R.string.message_tutorial_2_step_8, null, eVar, new F4.a(aVar10)), new u(R.string.message_tutorial_2_step_9, null, gVar, new F4.a(aVar9)), new u(R.string.message_tutorial_2_step_10, null, gVar, new F4.a(aVar8)), new u(R.string.message_tutorial_2_step_11, null, gVar, new F4.a(J2.a.f2365e)), new u(R.string.message_tutorial_2_step_12, null, gVar, new F4.a(J2.a.f2369i)), new u(R.string.message_tutorial_2_step_13, null, eVar, new F4.a(aVar3)), new u(R.string.message_tutorial_2_step_14, null, gVar, new F4.a(J2.a.f2372n)), new u(R.string.message_tutorial_2_step_15, null, gVar, new F4.a(aVar2)), new u(R.string.message_tutorial_2_step_16, null, gVar, new F4.a(aVar7)), new u(R.string.message_tutorial_2_step_17, null, gVar, new F4.a(aVar6)), new u(R.string.message_tutorial_2_step_18, null, gVar, new F4.a(aVar5)), new u(R.string.message_tutorial_2_step_19, null, eVar, bVar), new u(R.string.message_tutorial_2_step_20, null, dVar, bVar)));
                    } else {
                        k kVar4 = I4.a.f2099d;
                        if (o6.j.a(kVar, kVar4)) {
                            hVar2 = new F4.h(kVar4, new G4.a(R.string.message_tutorial_3_game_instructions, new H4.f(30, i12)), AbstractC0437l.X(new u(R.string.message_tutorial_3_step_1, null, eVar, bVar), new Object(), new u(R.string.message_tutorial_3_step_3, null, eVar, new F4.a(aVar12)), new u(R.string.message_tutorial_3_step_4, null, gVar, new F4.a(aVar13)), new u(R.string.message_tutorial_3_step_5, null, gVar, new F4.a(J2.a.f2379u)), new u(R.string.message_tutorial_3_step_6, null, eVar, new F4.a(aVar11)), new u(R.string.message_tutorial_3_step_7, null, gVar, new F4.a(aVar4)), new u(R.string.message_tutorial_3_step_8, new F4.w(R.drawable.ic_capture, R.string.message_tutorial_3_step_secondary_8), gVar, bVar), new u(R.string.message_tutorial_3_step_9, new F4.w(R.drawable.ic_cancel, R.string.message_tutorial_3_step_secondary_9), new F4.f(), bVar), new u(R.string.message_tutorial_3_step_10, null, gVar, new F4.a(aVar10)), new u(R.string.message_tutorial_1_step_11, null, gVar, new F4.a(aVar9)), new u(R.string.message_tutorial_3_step_12, null, eVar, new F4.a(aVar8)), new u(R.string.message_tutorial_3_step_13, null, gVar, new F4.a(aVar7)), new u(R.string.message_tutorial_3_step_14, null, eVar, new F4.a(aVar6)), new u(R.string.message_tutorial_3_step_15, null, gVar, new F4.a(aVar5)), new u(R.string.message_tutorial_3_step_16, null, gVar, new F4.a(aVar)), new u(R.string.message_tutorial_3_step_17, null, dVar, bVar)));
                        } else {
                            k kVar5 = I4.a.f2100e;
                            if (o6.j.a(kVar, kVar5)) {
                                hVar2 = new F4.h(kVar5, new G4.a(R.string.message_tutorial_1_step_1, new H4.f(i11, i10)), E2.d.y(new u(R.string.message_tutorial_1_step_1, null, eVar, bVar)));
                            } else {
                                k kVar6 = I4.a.f2098c;
                                if (o6.j.a(kVar, kVar6)) {
                                    r15 = 0;
                                    hVar2 = new F4.h(kVar6, new G4.a(R.string.message_tutorial_1_step_1, new H4.e()), E2.d.y(new u(R.string.message_tutorial_1_step_1, null, eVar, bVar)));
                                    if (hVar2 == null) {
                                        return;
                                    }
                                    L4.j jVar3 = jVar;
                                    AbstractC0166y.q(jVar3.f2923f, r15, r15, new L4.g(i4, jVar3, hVar2, r15), i8);
                                    return;
                                }
                                hVar = null;
                            }
                        }
                    }
                }
                r15 = 0;
                if (hVar2 == null) {
                }
            }
            hVar2 = hVar;
            r15 = hVar;
            if (hVar2 == null) {
            }
        } else {
            Log.e("TutorialRepository", "Can't start tutorial, index is invalid " + i9);
        }
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        o6.j.e(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_tutorial_game, viewGroup, false);
        int i4 = R.id.blue_target;
        AppCompatImageView appCompatImageView = (AppCompatImageView) E2.b.r(inflate, R.id.blue_target);
        if (appCompatImageView != null) {
            i4 = R.id.button_start_retry;
            MaterialButton materialButton = (MaterialButton) E2.b.r(inflate, R.id.button_start_retry);
            if (materialButton != null) {
                i4 = R.id.card_high_score;
                if (((MaterialCardView) E2.b.r(inflate, R.id.card_high_score)) != null) {
                    i4 = R.id.card_instructions;
                    if (((MaterialCardView) E2.b.r(inflate, R.id.card_instructions)) != null) {
                        i4 = R.id.card_score;
                        if (((MaterialCardView) E2.b.r(inflate, R.id.card_score)) != null) {
                            i4 = R.id.footer;
                            View r8 = E2.b.r(inflate, R.id.footer);
                            if (r8 != null) {
                                MaterialCardView materialCardView = (MaterialCardView) r8;
                                MaterialTextView materialTextView = (MaterialTextView) E2.b.r(r8, R.id.text_time_left);
                                if (materialTextView != null) {
                                    A.i iVar = new A.i(materialCardView, 11, materialTextView);
                                    i4 = R.id.game_area;
                                    MaterialCardView materialCardView2 = (MaterialCardView) E2.b.r(inflate, R.id.game_area);
                                    if (materialCardView2 != null) {
                                        i4 = R.id.red_target;
                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) E2.b.r(inflate, R.id.red_target);
                                        if (appCompatImageView2 != null) {
                                            i4 = R.id.space_overlay_menu;
                                            MaterialCardView materialCardView3 = (MaterialCardView) E2.b.r(inflate, R.id.space_overlay_menu);
                                            if (materialCardView3 != null) {
                                                i4 = R.id.text_high_score;
                                                MaterialTextView materialTextView2 = (MaterialTextView) E2.b.r(inflate, R.id.text_high_score);
                                                if (materialTextView2 != null) {
                                                    i4 = R.id.text_instructions;
                                                    MaterialTextView materialTextView3 = (MaterialTextView) E2.b.r(inflate, R.id.text_instructions);
                                                    if (materialTextView3 != null) {
                                                        i4 = R.id.text_score;
                                                        MaterialTextView materialTextView4 = (MaterialTextView) E2.b.r(inflate, R.id.text_score);
                                                        if (materialTextView4 != null) {
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                            this.f9838i0 = new a(constraintLayout, appCompatImageView, materialButton, iVar, materialCardView2, appCompatImageView2, materialCardView3, materialTextView2, materialTextView3, materialTextView4);
                                                            o6.j.d(constraintLayout, "getRoot(...)");
                                                            return constraintLayout;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    throw new NullPointerException("Missing required view with ID: ".concat(r8.getResources().getResourceName(R.id.text_time_left)));
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final void y() {
        this.f11093I = true;
        C1.g S8 = S();
        S4.h hVar = S8.f579h;
        if (hVar != null) {
            hVar.i();
        }
        S8.f579h = null;
        S().f(O(), new B0.e(9, this));
    }
}
