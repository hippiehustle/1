package com.buzbuz.smartautoclicker.settings;

import A4.c;
import A4.d;
import J3.s;
import L7.AbstractC0166y;
import M1.e;
import P1.w;
import V5.f;
import V5.j;
import X5.b;
import Z.g;
import Z5.a;
import Z5.h;
import Z5.y;
import a.AbstractC0405a;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.U;
import androidx.lifecycle.b0;
import com.buzbuz.smartautoclicker.R;
import com.buzbuz.smartautoclicker.settings.SettingsFragment;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.textview.MaterialTextView;
import d5.o;
import d5.p;
import d5.r;
import g0.AbstractComponentCallbacksC0755y;
import i.AbstractActivityC0870i;
import java.util.List;
import kotlin.Metadata;
import n6.InterfaceC1162a;
import o6.v;
import q4.X;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/buzbuz/smartautoclicker/settings/SettingsFragment;", "Lg0/y;", "<init>", "()V", "smartautoclicker_fDroidRelease"}, k = 1, mv = {g.FLOAT_FIELD_NUMBER, g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SettingsFragment extends AbstractComponentCallbacksC0755y implements b {

    /* renamed from: c0, reason: collision with root package name */
    public j f9872c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f9873d0;

    /* renamed from: e0, reason: collision with root package name */
    public volatile f f9874e0;

    /* renamed from: f0, reason: collision with root package name */
    public final Object f9875f0 = new Object();

    /* renamed from: g0, reason: collision with root package name */
    public boolean f9876g0 = false;

    /* renamed from: h0, reason: collision with root package name */
    public final d f9877h0;

    /* renamed from: i0, reason: collision with root package name */
    public H3.b f9878i0;

    public SettingsFragment() {
        Z5.g c6 = a.c(h.f7483e, new e(19, new e(18, this)));
        this.f9877h0 = new d(v.f13643a.b(r.class), new M1.f(c6, 16), new M1.g(this, c6, 8), new M1.f(c6, 17));
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final LayoutInflater B(Bundle bundle) {
        LayoutInflater B8 = super.B(bundle);
        return B8.cloneInContext(new j(B8, this));
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final void H(View view) {
        o6.j.e(view, "view");
        H3.b bVar = this.f9878i0;
        if (bVar != null) {
            c cVar = (c) bVar.f1911p;
            c cVar2 = (c) cVar.f292f;
            String string = O().getString(R.string.field_show_scenario_filters_ui_title);
            o6.j.d(string, "getString(...)");
            X.W(cVar2, string);
            String string2 = O().getString(R.string.field_show_scenario_filters_ui_desc);
            o6.j.d(string2, "getString(...)");
            E2.c.z0((MaterialTextView) cVar2.f292f, string2);
            E2.b.J(cVar, new s(0, S(), r.class, "toggleScenarioFiltersUi", "toggleScenarioFiltersUi()V", 0, 0, 7));
            H3.b bVar2 = this.f9878i0;
            if (bVar2 != null) {
                c cVar3 = (c) bVar2.f1907l;
                c cVar4 = (c) cVar3.f292f;
                String string3 = O().getString(R.string.field_legacy_action_ui_title);
                o6.j.d(string3, "getString(...)");
                X.W(cVar4, string3);
                String string4 = O().getString(R.string.field_legacy_action_ui_desc);
                o6.j.d(string4, "getString(...)");
                E2.c.z0((MaterialTextView) cVar4.f292f, string4);
                E2.b.J(cVar3, new s(0, S(), r.class, "toggleLegacyActionUi", "toggleLegacyActionUi()V", 0, 0, 8));
                H3.b bVar3 = this.f9878i0;
                if (bVar3 != null) {
                    c cVar5 = (c) bVar3.f1908m;
                    c cVar6 = (c) cVar5.f292f;
                    String string5 = O().getString(R.string.field_legacy_notification_ui_title);
                    o6.j.d(string5, "getString(...)");
                    X.W(cVar6, string5);
                    String string6 = O().getString(R.string.field_legacy_notification_ui_desc);
                    o6.j.d(string6, "getString(...)");
                    E2.c.z0((MaterialTextView) cVar6.f292f, string6);
                    E2.b.J(cVar5, new s(0, S(), r.class, "toggleLegacyNotificationUi", "toggleLegacyNotificationUi()V", 0, 0, 9));
                    H3.b bVar4 = this.f9878i0;
                    if (bVar4 != null) {
                        c cVar7 = (c) bVar4.j;
                        c cVar8 = (c) cVar7.f292f;
                        String string7 = O().getString(R.string.field_force_entire_screen_title);
                        o6.j.d(string7, "getString(...)");
                        X.W(cVar8, string7);
                        String string8 = O().getString(R.string.field_force_entire_screen_desc);
                        o6.j.d(string8, "getString(...)");
                        E2.c.z0((MaterialTextView) cVar8.f292f, string8);
                        E2.b.J(cVar7, new s(0, S(), r.class, "toggleForceEntireScreenCapture", "toggleForceEntireScreenCapture()V", 0, 0, 10));
                        H3.b bVar5 = this.f9878i0;
                        if (bVar5 != null) {
                            c cVar9 = (c) bVar5.k;
                            c cVar10 = (c) cVar9.f292f;
                            String string9 = O().getString(R.string.field_input_block_workaround_title);
                            o6.j.d(string9, "getString(...)");
                            X.W(cVar10, string9);
                            String string10 = O().getString(R.string.field_input_block_workaround_desc);
                            o6.j.d(string10, "getString(...)");
                            E2.c.z0((MaterialTextView) cVar10.f292f, string10);
                            E2.b.J(cVar9, new s(0, S(), r.class, "toggleInputBlockWorkaround", "toggleInputBlockWorkaround()V", 0, 0, 11));
                            H3.b bVar6 = this.f9878i0;
                            if (bVar6 != null) {
                                c cVar11 = (c) bVar6.f1909n;
                                String string11 = O().getString(R.string.field_privacy);
                                o6.j.d(string11, "getString(...)");
                                E2.c.A0(cVar11, string11);
                                final int i4 = 0;
                                E2.c.w0(cVar11, new InterfaceC1162a(this) { // from class: d5.b

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ SettingsFragment f10404e;

                                    {
                                        this.f10404e = this;
                                    }

                                    @Override // n6.InterfaceC1162a
                                    public final Object a() {
                                        int i8 = i4;
                                        y yVar = y.f7506a;
                                        SettingsFragment settingsFragment = this.f10404e;
                                        switch (i8) {
                                            case 0:
                                                r S8 = settingsFragment.S();
                                                settingsFragment.M();
                                                S8.f10435c.getClass();
                                                return yVar;
                                            case 1:
                                                r S9 = settingsFragment.S();
                                                settingsFragment.M();
                                                S9.f10435c.getClass();
                                                return yVar;
                                            default:
                                                r S10 = settingsFragment.S();
                                                AbstractActivityC0870i M8 = settingsFragment.M();
                                                w wVar = S10.f10434b;
                                                List list = w.f4488i;
                                                wVar.getClass();
                                                w.a(M8, null);
                                                return yVar;
                                        }
                                    }
                                });
                                H3.b bVar7 = this.f9878i0;
                                if (bVar7 != null) {
                                    c cVar12 = (c) bVar7.f1910o;
                                    String string12 = O().getString(R.string.field_remove_ads);
                                    o6.j.d(string12, "getString(...)");
                                    E2.c.A0(cVar12, string12);
                                    final int i8 = 1;
                                    E2.c.w0(cVar12, new InterfaceC1162a(this) { // from class: d5.b

                                        /* renamed from: e, reason: collision with root package name */
                                        public final /* synthetic */ SettingsFragment f10404e;

                                        {
                                            this.f10404e = this;
                                        }

                                        @Override // n6.InterfaceC1162a
                                        public final Object a() {
                                            int i82 = i8;
                                            y yVar = y.f7506a;
                                            SettingsFragment settingsFragment = this.f10404e;
                                            switch (i82) {
                                                case 0:
                                                    r S8 = settingsFragment.S();
                                                    settingsFragment.M();
                                                    S8.f10435c.getClass();
                                                    return yVar;
                                                case 1:
                                                    r S9 = settingsFragment.S();
                                                    settingsFragment.M();
                                                    S9.f10435c.getClass();
                                                    return yVar;
                                                default:
                                                    r S10 = settingsFragment.S();
                                                    AbstractActivityC0870i M8 = settingsFragment.M();
                                                    w wVar = S10.f10434b;
                                                    List list = w.f4488i;
                                                    wVar.getClass();
                                                    w.a(M8, null);
                                                    return yVar;
                                            }
                                        }
                                    });
                                    H3.b bVar8 = this.f9878i0;
                                    if (bVar8 != null) {
                                        c cVar13 = (c) bVar8.f1912q;
                                        String string13 = O().getString(R.string.field_troubleshooting);
                                        o6.j.d(string13, "getString(...)");
                                        E2.c.A0(cVar13, string13);
                                        final int i9 = 2;
                                        E2.c.w0(cVar13, new InterfaceC1162a(this) { // from class: d5.b

                                            /* renamed from: e, reason: collision with root package name */
                                            public final /* synthetic */ SettingsFragment f10404e;

                                            {
                                                this.f10404e = this;
                                            }

                                            @Override // n6.InterfaceC1162a
                                            public final Object a() {
                                                int i82 = i9;
                                                y yVar = y.f7506a;
                                                SettingsFragment settingsFragment = this.f10404e;
                                                switch (i82) {
                                                    case 0:
                                                        r S8 = settingsFragment.S();
                                                        settingsFragment.M();
                                                        S8.f10435c.getClass();
                                                        return yVar;
                                                    case 1:
                                                        r S9 = settingsFragment.S();
                                                        settingsFragment.M();
                                                        S9.f10435c.getClass();
                                                        return yVar;
                                                    default:
                                                        r S10 = settingsFragment.S();
                                                        AbstractActivityC0870i M8 = settingsFragment.M();
                                                        w wVar = S10.f10434b;
                                                        List list = w.f4488i;
                                                        wVar.getClass();
                                                        w.a(M8, null);
                                                        return yVar;
                                                }
                                            }
                                        });
                                        AbstractC0166y.q(U.e(this), null, null, new o(this, null), 3);
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

    public final r S() {
        return (r) this.f9877h0.getValue();
    }

    public final void T() {
        if (this.f9872c0 == null) {
            this.f9872c0 = new j(super.j(), this);
            this.f9873d0 = AbstractC0405a.b0(super.j());
        }
    }

    @Override // X5.b
    public final Object a() {
        if (this.f9874e0 == null) {
            synchronized (this.f9875f0) {
                try {
                    if (this.f9874e0 == null) {
                        this.f9874e0 = new f(this);
                    }
                } finally {
                }
            }
        }
        return this.f9874e0.a();
    }

    @Override // g0.AbstractComponentCallbacksC0755y, androidx.lifecycle.InterfaceC0499j
    public final b0 d() {
        return E2.d.v(this, super.d());
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final Context j() {
        if (super.j() == null && !this.f9873d0) {
            return null;
        }
        T();
        return this.f9872c0;
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final void u(Activity activity) {
        boolean z8;
        this.f11093I = true;
        j jVar = this.f9872c0;
        if (jVar != null && f.c(jVar) != activity) {
            z8 = false;
        } else {
            z8 = true;
        }
        E2.b.h(z8, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        T();
        if (!this.f9876g0) {
            this.f9876g0 = true;
            ((p) a()).getClass();
        }
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final void v(Context context) {
        super.v(context);
        T();
        if (!this.f9876g0) {
            this.f9876g0 = true;
            ((p) a()).getClass();
        }
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        o6.j.e(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_settings, viewGroup, false);
        int i4 = R.id.divider_force_entire_screen;
        MaterialDivider materialDivider = (MaterialDivider) E2.b.r(inflate, R.id.divider_force_entire_screen);
        if (materialDivider != null) {
            i4 = R.id.divider_input_block_workaround;
            MaterialDivider materialDivider2 = (MaterialDivider) E2.b.r(inflate, R.id.divider_input_block_workaround);
            if (materialDivider2 != null) {
                i4 = R.id.divider_privacy_settings;
                MaterialDivider materialDivider3 = (MaterialDivider) E2.b.r(inflate, R.id.divider_privacy_settings);
                if (materialDivider3 != null) {
                    i4 = R.id.divider_remove_ads;
                    MaterialDivider materialDivider4 = (MaterialDivider) E2.b.r(inflate, R.id.divider_remove_ads);
                    if (materialDivider4 != null) {
                        i4 = R.id.field_force_entire_screen;
                        View r8 = E2.b.r(inflate, R.id.field_force_entire_screen);
                        if (r8 != null) {
                            c e9 = c.e(r8);
                            i4 = R.id.field_input_block_workaround;
                            View r9 = E2.b.r(inflate, R.id.field_input_block_workaround);
                            if (r9 != null) {
                                c e10 = c.e(r9);
                                i4 = R.id.field_legacy_actions_ui;
                                View r10 = E2.b.r(inflate, R.id.field_legacy_actions_ui);
                                if (r10 != null) {
                                    c e11 = c.e(r10);
                                    i4 = R.id.field_legacy_notification_ui;
                                    View r11 = E2.b.r(inflate, R.id.field_legacy_notification_ui);
                                    if (r11 != null) {
                                        c e12 = c.e(r11);
                                        i4 = R.id.field_privacy_settings;
                                        View r12 = E2.b.r(inflate, R.id.field_privacy_settings);
                                        if (r12 != null) {
                                            c d2 = c.d(r12);
                                            i4 = R.id.field_remove_ads;
                                            View r13 = E2.b.r(inflate, R.id.field_remove_ads);
                                            if (r13 != null) {
                                                c d3 = c.d(r13);
                                                i4 = R.id.field_show_scenario_filters;
                                                View r14 = E2.b.r(inflate, R.id.field_show_scenario_filters);
                                                if (r14 != null) {
                                                    c e13 = c.e(r14);
                                                    i4 = R.id.field_troubleshooting;
                                                    View r15 = E2.b.r(inflate, R.id.field_troubleshooting);
                                                    if (r15 != null) {
                                                        NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                                                        this.f9878i0 = new H3.b(nestedScrollView, materialDivider, materialDivider2, materialDivider3, materialDivider4, e9, e10, e11, e12, d2, d3, e13, c.d(r15), 1);
                                                        o6.j.d(nestedScrollView, "getRoot(...)");
                                                        return nestedScrollView;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }
}
