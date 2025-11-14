package A;

import D4.C0027c;
import L3.M;
import L3.S;
import L7.AbstractC0166y;
import M3.H;
import O3.J;
import O3.N;
import O3.a0;
import O7.C0245s;
import O7.C0250x;
import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import O7.L;
import P1.w;
import P6.z;
import P7.y;
import X.C0345m;
import X.C0346n;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.graphics.PointF;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.C0500k;
import androidx.lifecycle.EnumC0504o;
import androidx.recyclerview.widget.RecyclerView;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import d6.InterfaceC0617c;
import d6.InterfaceC0622h;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import n6.InterfaceC1164c;
import org.xmlpull.v1.XmlPullParserException;
import q4.X;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
public final class i implements M0.a, InterfaceC0233f, z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f87d;

    /* renamed from: e, reason: collision with root package name */
    public Object f88e;

    /* renamed from: f, reason: collision with root package name */
    public Object f89f;

    public /* synthetic */ i(int i4) {
        this.f87d = i4;
    }

    public static i a(View view) {
        TextInputEditText textInputEditText = (TextInputEditText) E2.b.r(view, R.id.text_field);
        if (textInputEditText != null) {
            return new i((TextInputLayout) view, 7, textInputEditText);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.text_field)));
    }

    public static O2.c c(PointF pointF, MotionEvent motionEvent) {
        double d2 = 2;
        if (((float) Math.sqrt(((float) Math.pow(pointF.x - motionEvent.getX(), d2)) + ((float) Math.pow(pointF.y - motionEvent.getY(), d2)))) <= 40.0f) {
            return new O2.a(pointF, motionEvent.getEventTime() - motionEvent.getDownTime());
        }
        return new O2.b(motionEvent.getEventTime() - motionEvent.getDownTime(), pointF, new PointF(motionEvent.getX(), motionEvent.getY()));
    }

    public static i e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.item_list_header, viewGroup, false);
        MaterialTextView materialTextView = (MaterialTextView) E2.b.r(inflate, R.id.text_header);
        if (materialTextView != null) {
            return new i((LinearLayout) inflate, 8, materialTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.text_header)));
    }

    public Bundle b(String str) {
        Bundle bundle;
        C0.b bVar = (C0.b) this.f88e;
        if (bVar.f559g) {
            Bundle bundle2 = bVar.f558f;
            if (bundle2 == null) {
                return null;
            }
            if (bundle2.containsKey(str)) {
                bundle = bundle2.getBundle(str);
                if (bundle == null) {
                    AbstractC1492c.z(str);
                    throw null;
                }
            } else {
                bundle = null;
            }
            bundle2.remove(str);
            if (bundle2.isEmpty()) {
                bVar.f558f = null;
            }
            return bundle;
        }
        throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
    }

    public B0.d d() {
        B0.d dVar;
        C0.b bVar = (C0.b) this.f88e;
        synchronized (bVar.f555c) {
            Iterator it = bVar.f556d.entrySet().iterator();
            do {
                dVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                B0.d dVar2 = (B0.d) entry.getValue();
                if (o6.j.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    dVar = dVar2;
                }
            } while (dVar == null);
        }
        return dVar;
    }

    public void f(M.g gVar) {
        M.m mVar = (M.m) this.f89f;
        W0.c cVar = (W0.c) this.f88e;
        int i4 = gVar.f3282b;
        if (i4 == 0) {
            mVar.execute(new E.b(cVar, 5, gVar.f3281a));
        } else {
            mVar.execute(new A5.c(cVar, i4, 2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x01d3, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:38:0x009c. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(Context context, XmlResourceParser xmlResourceParser) {
        int i4;
        int eventType;
        k kVar;
        p pVar = new p();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i8 = 0; i8 < attributeCount; i8++) {
            if ("id".equals(xmlResourceParser.getAttributeName(i8))) {
                String attributeValue = xmlResourceParser.getAttributeValue(i8);
                if (attributeValue.contains("/")) {
                    i4 = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                } else {
                    i4 = -1;
                }
                if (i4 == -1) {
                    if (attributeValue.length() > 1) {
                        i4 = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    eventType = xmlResourceParser.getEventType();
                    kVar = null;
                } catch (IOException e9) {
                    e9.printStackTrace();
                } catch (XmlPullParserException e10) {
                    e10.printStackTrace();
                }
                while (eventType != 1) {
                    if (eventType != 0) {
                        char c6 = 3;
                        if (eventType != 2) {
                            if (eventType != 3) {
                                continue;
                            } else {
                                String name = xmlResourceParser.getName();
                                if (!"ConstraintSet".equals(name)) {
                                    if (name.equalsIgnoreCase("Constraint")) {
                                        pVar.f177c.put(Integer.valueOf(kVar.f90a), kVar);
                                        kVar = null;
                                    }
                                } else {
                                    ((SparseArray) this.f89f).put(i4, pVar);
                                    return;
                                }
                            }
                        } else {
                            String name2 = xmlResourceParser.getName();
                            switch (name2.hashCode()) {
                                case -2025855158:
                                    if (name2.equals("Layout")) {
                                        c6 = 5;
                                        break;
                                    }
                                    c6 = 65535;
                                    break;
                                case -1984451626:
                                    if (name2.equals("Motion")) {
                                        c6 = 6;
                                        break;
                                    }
                                    c6 = 65535;
                                    break;
                                case -1269513683:
                                    if (name2.equals("PropertySet")) {
                                        break;
                                    }
                                    c6 = 65535;
                                    break;
                                case -1238332596:
                                    if (name2.equals("Transform")) {
                                        c6 = 4;
                                        break;
                                    }
                                    c6 = 65535;
                                    break;
                                case -71750448:
                                    if (name2.equals("Guideline")) {
                                        c6 = 1;
                                        break;
                                    }
                                    c6 = 65535;
                                    break;
                                case 1331510167:
                                    if (name2.equals("Barrier")) {
                                        c6 = 2;
                                        break;
                                    }
                                    c6 = 65535;
                                    break;
                                case 1791837707:
                                    if (name2.equals("CustomAttribute")) {
                                        c6 = 7;
                                        break;
                                    }
                                    c6 = 65535;
                                    break;
                                case 1803088381:
                                    if (name2.equals("Constraint")) {
                                        c6 = 0;
                                        break;
                                    }
                                    c6 = 65535;
                                    break;
                                default:
                                    c6 = 65535;
                                    break;
                            }
                            switch (c6) {
                                case 0:
                                    kVar = p.e(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 1:
                                    kVar = p.e(context, Xml.asAttributeSet(xmlResourceParser));
                                    kVar.f93d.f120a = true;
                                    break;
                                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                    kVar = p.e(context, Xml.asAttributeSet(xmlResourceParser));
                                    kVar.f93d.f125c0 = 1;
                                    break;
                                case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                    if (kVar != null) {
                                        kVar.f91b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                        break;
                                    } else {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                    if (kVar != null) {
                                        kVar.f94e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                        break;
                                    } else {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                case Z.g.STRING_FIELD_NUMBER /* 5 */:
                                    if (kVar != null) {
                                        kVar.f93d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                        break;
                                    } else {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                    if (kVar != null) {
                                        kVar.f92c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                        break;
                                    } else {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                    if (kVar != null) {
                                        b.a(context, xmlResourceParser, kVar.f95f);
                                        break;
                                    } else {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                            }
                        }
                    } else {
                        xmlResourceParser.getName();
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.f89f).put(i4, pVar);
                return;
            }
        }
    }

    @Override // M0.a
    public View getRoot() {
        switch (this.f87d) {
            case 1:
                return (FrameLayout) this.f88e;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            default:
                return (MaterialCardView) this.f88e;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return (FrameLayout) this.f88e;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                return (TextInputLayout) this.f88e;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                return (LinearLayout) this.f88e;
            case 9:
                return (LinearLayout) this.f88e;
            case 10:
                return (RecyclerView) this.f88e;
        }
    }

    public void h() {
        ((C0.b) this.f88e).a();
    }

    public void i(Bundle bundle) {
        C0.b bVar = (C0.b) this.f88e;
        B0.f fVar = bVar.f553a;
        if (!bVar.f557e) {
            bVar.a();
        }
        if (fVar.g().f8862d.compareTo(EnumC0504o.f8849g) < 0) {
            if (!bVar.f559g) {
                Bundle bundle2 = null;
                if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                    Bundle bundle3 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    if (bundle3 != null) {
                        bundle2 = bundle3;
                    } else {
                        AbstractC1492c.z("androidx.lifecycle.BundlableSavedStateRegistry.key");
                        throw null;
                    }
                }
                bVar.f558f = bundle2;
                bVar.f559g = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + fVar.g().f8862d).toString());
    }

    public void j(Bundle bundle) {
        C0.b bVar = (C0.b) this.f88e;
        Bundle k = X.k((Z5.j[]) Arrays.copyOf(new Z5.j[0], 0));
        Bundle bundle2 = bVar.f558f;
        if (bundle2 != null) {
            k.putAll(bundle2);
        }
        synchronized (bVar.f555c) {
            for (Map.Entry entry : bVar.f556d.entrySet()) {
                D2.f.E(k, (String) entry.getKey(), ((B0.d) entry.getValue()).a());
            }
        }
        if (!k.isEmpty()) {
            D2.f.E(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key", k);
        }
    }

    public void k(String str, B0.d dVar) {
        o6.j.e(dVar, "provider");
        C0.b bVar = (C0.b) this.f88e;
        synchronized (bVar.f555c) {
            if (!bVar.f556d.containsKey(str)) {
                bVar.f556d.put(str, dVar);
            } else {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
        }
    }

    public void l() {
        if (((C0.b) this.f88e).f560h) {
            B0.a aVar = (B0.a) this.f89f;
            if (aVar == null) {
                aVar = new B0.a(this);
            }
            this.f89f = aVar;
            try {
                C0500k.class.getDeclaredConstructor(null);
                B0.a aVar2 = (B0.a) this.f89f;
                if (aVar2 != null) {
                    ((LinkedHashSet) aVar2.f415b).add(C0500k.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e9) {
                throw new IllegalArgumentException("Class " + C0500k.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e9);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    public String toString() {
        switch (this.f87d) {
            case 14:
                return (String) this.f88e;
            case 27:
                return "Bounds{lower=" + ((H.c) this.f88e) + " upper=" + ((H.c) this.f89f) + "}";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f5  */
    /* JADX WARN: Type inference failed for: r0v20, types: [o6.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [f6.j, n6.c] */
    @Override // O7.InterfaceC0233f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        C0245s c0245s;
        int i4;
        EnumC0646a enumC0646a;
        Throwable th;
        y yVar;
        i iVar;
        InterfaceC0234g interfaceC0234g2;
        InterfaceC0233f interfaceC0233f;
        C0250x c0250x;
        int i8;
        M m6;
        switch (this.f87d) {
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                Object x8 = ((InterfaceC0233f) this.f88e).x(new C1.e(interfaceC0234g, (E4.n) this.f89f), interfaceC0617c);
                if (x8 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x8;
            case 12:
                Object x9 = ((W0.d) this.f88e).x(new M(interfaceC0234g, 0, (S) this.f89f), interfaceC0617c);
                if (x9 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x9;
            case 13:
                Object x10 = ((InterfaceC0233f) this.f88e).x(new M(interfaceC0234g, 1, (L4.j) this.f89f), interfaceC0617c);
                if (x10 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x10;
            case 16:
                Object x11 = ((L) this.f88e).x(new M(interfaceC0234g, 2, (H) this.f89f), interfaceC0617c);
                if (x11 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x11;
            case 18:
                Object x12 = ((InterfaceC0233f) this.f88e).x(new M(interfaceC0234g, 3, (N1.c) this.f89f), interfaceC0617c);
                if (x12 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x12;
            case 20:
                Object x13 = ((O3.H) this.f88e).x(new N(interfaceC0234g, (a0) this.f89f, 0), interfaceC0617c);
                if (x13 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x13;
            case 21:
                Object x14 = ((W0.d) this.f88e).x(new N(interfaceC0234g, (a0) this.f89f, 1), interfaceC0617c);
                if (x14 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x14;
            case 23:
                if (interfaceC0617c instanceof C0245s) {
                    c0245s = (C0245s) interfaceC0617c;
                    int i9 = c0245s.f4179h;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        c0245s.f4179h = i9 - Integer.MIN_VALUE;
                        Object obj = c0245s.f4178g;
                        i4 = c0245s.f4179h;
                        enumC0646a = EnumC0646a.f10656d;
                        if (i4 == 0) {
                            if (i4 != 1) {
                                if (i4 == 2) {
                                    Z5.a.d(obj);
                                    return Z5.y.f7506a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            yVar = c0245s.f4181l;
                            interfaceC0234g2 = c0245s.k;
                            iVar = c0245s.j;
                            try {
                                Z5.a.d(obj);
                            } catch (Throwable th2) {
                                th = th2;
                                yVar.w();
                                throw th;
                            }
                        } else {
                            Z5.a.d(obj);
                            InterfaceC0622h interfaceC0622h = c0245s.f10782e;
                            o6.j.b(interfaceC0622h);
                            y yVar2 = new y(interfaceC0234g, interfaceC0622h);
                            try {
                                C0345m c0345m = (C0345m) this.f88e;
                                c0245s.j = this;
                                c0245s.k = interfaceC0234g;
                                c0245s.f4181l = yVar2;
                                c0245s.f4179h = 1;
                                if (c0345m.l(yVar2, c0245s) != enumC0646a) {
                                    iVar = this;
                                    interfaceC0234g2 = interfaceC0234g;
                                    yVar = yVar2;
                                } else {
                                    return enumC0646a;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                yVar = yVar2;
                                yVar.w();
                                throw th;
                            }
                        }
                        yVar.w();
                        interfaceC0233f = (InterfaceC0233f) iVar.f89f;
                        c0245s.j = null;
                        c0245s.k = null;
                        c0245s.f4181l = null;
                        c0245s.f4179h = 2;
                        if (interfaceC0233f.x(interfaceC0234g2, c0245s) == enumC0646a) {
                            return enumC0646a;
                        }
                        return Z5.y.f7506a;
                    }
                }
                c0245s = new C0245s(this, interfaceC0617c);
                Object obj2 = c0245s.f4178g;
                i4 = c0245s.f4179h;
                enumC0646a = EnumC0646a.f10656d;
                if (i4 == 0) {
                }
                yVar.w();
                interfaceC0233f = (InterfaceC0233f) iVar.f89f;
                c0245s.j = null;
                c0245s.k = null;
                c0245s.f4181l = null;
                c0245s.f4179h = 2;
                if (interfaceC0233f.x(interfaceC0234g2, c0245s) == enumC0646a) {
                }
                return Z5.y.f7506a;
            case 24:
                Object x15 = ((InterfaceC0233f) this.f88e).x(new C0027c((o6.r) new Object(), interfaceC0234g, (InterfaceC1164c) this.f89f), interfaceC0617c);
                if (x15 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x15;
            case 25:
                if (interfaceC0617c instanceof C0250x) {
                    c0250x = (C0250x) interfaceC0617c;
                    int i10 = c0250x.f4195h;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0250x.f4195h = i10 - Integer.MIN_VALUE;
                        Object obj3 = c0250x.f4194g;
                        i8 = c0250x.f4195h;
                        if (i8 == 0) {
                            if (i8 == 1) {
                                m6 = c0250x.j;
                                try {
                                    Z5.a.d(obj3);
                                } catch (AbortFlowException e9) {
                                    e = e9;
                                    if (e.f12159d != m6) {
                                        InterfaceC0622h interfaceC0622h2 = c0250x.f10782e;
                                        o6.j.b(interfaceC0622h2);
                                        AbstractC0166y.i(interfaceC0622h2);
                                        return Z5.y.f7506a;
                                    }
                                    throw e;
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj3);
                            i iVar2 = (i) this.f88e;
                            M m8 = new M((C0346n) this.f89f, interfaceC0234g, 5);
                            try {
                                c0250x.j = m8;
                                c0250x.f4195h = 1;
                                Object x16 = iVar2.x(m8, c0250x);
                                EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
                                if (x16 == enumC0646a2) {
                                    return enumC0646a2;
                                }
                            } catch (AbortFlowException e10) {
                                e = e10;
                                m6 = m8;
                                if (e.f12159d != m6) {
                                }
                            }
                        }
                        return Z5.y.f7506a;
                    }
                }
                c0250x = new C0250x(this, interfaceC0617c);
                Object obj32 = c0250x.f4194g;
                i8 = c0250x.f4195h;
                if (i8 == 0) {
                }
                return Z5.y.f7506a;
            case 26:
                Object x17 = ((InterfaceC0233f) this.f88e).x(new M(interfaceC0234g, 7, this.f89f), interfaceC0617c);
                if (x17 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x17;
            default:
                Object x18 = ((InterfaceC0233f) this.f88e).x(new J(interfaceC0234g, (w) this.f89f, 16), interfaceC0617c);
                if (x18 != EnumC0646a.f10656d) {
                    return Z5.y.f7506a;
                }
                return x18;
        }
    }

    public /* synthetic */ i(int i4, Object obj) {
        this.f87d = i4;
        this.f88e = obj;
    }

    public /* synthetic */ i(Object obj, int i4, Object obj2) {
        this.f87d = i4;
        this.f88e = obj;
        this.f89f = obj2;
    }

    public i(C0.b bVar) {
        this.f87d = 3;
        this.f88e = bVar;
        this.f89f = new i(2, bVar);
    }

    public i(o6.m mVar, M6.h hVar) {
        this.f87d = 17;
        this.f88e = mVar;
        this.f89f = hVar;
        if (hVar.f3495b != 1 || hVar.f3496c != 1) {
            throw new IllegalArgumentException(j.m("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar, " was passed").toString());
        }
    }

    public i(LinearLayout linearLayout, MaterialCheckBox materialCheckBox, MaterialButton materialButton, MaterialTextView materialTextView) {
        this.f87d = 9;
        this.f88e = linearLayout;
        this.f89f = materialCheckBox;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(InterfaceC0233f interfaceC0233f, InterfaceC1164c interfaceC1164c) {
        this.f87d = 24;
        this.f88e = interfaceC0233f;
        this.f89f = (AbstractC0720j) interfaceC1164c;
    }

    public i(Map map) {
        this.f87d = 29;
        this.f88e = map;
        this.f89f = new v7.k("Java nullability annotation states").c(new B6.n(7, this));
    }

    public i(ArrayList arrayList, ArrayList arrayList2) {
        this.f87d = 6;
        int size = arrayList.size();
        this.f88e = new int[size];
        this.f89f = new float[size];
        for (int i4 = 0; i4 < size; i4++) {
            ((int[]) this.f88e)[i4] = ((Integer) arrayList.get(i4)).intValue();
            ((float[]) this.f89f)[i4] = ((Float) arrayList2.get(i4)).floatValue();
        }
    }

    public i(int i4, int i8) {
        this.f87d = 6;
        this.f88e = new int[]{i4, i8};
        this.f89f = new float[]{0.0f, 1.0f};
    }

    public i(int i4, int i8, int i9) {
        this.f87d = 6;
        this.f88e = new int[]{i4, i8, i9};
        this.f89f = new float[]{0.0f, 0.5f, 1.0f};
    }

    public i(String str) {
        this.f87d = 14;
        o6.j.e(str, "name");
        this.f88e = str;
        this.f89f = new ArrayList(0);
        N6.k.f3794a.getClass();
        List a3 = N6.j.a();
        new ArrayList();
        Iterator it = a3.iterator();
        while (it.hasNext()) {
            ((N6.k) it.next()).getClass();
        }
    }
}
