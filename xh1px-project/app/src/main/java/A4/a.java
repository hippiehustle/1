package A4;

import C6.A;
import C6.C;
import C6.D;
import C6.InterfaceC0004e;
import C6.O;
import F6.U;
import L7.AbstractC0166y;
import L7.C0156n;
import L7.C0161t;
import L7.X;
import O7.InterfaceC0233f;
import O7.L;
import O7.i0;
import X.C0334b;
import X.C0340h;
import X.C0343k;
import X.E;
import X.H;
import X.V;
import X.W;
import X.b0;
import Y6.l;
import Y6.m;
import Y6.n;
import Y6.p;
import Z4.g;
import Z5.y;
import a.AbstractC0405a;
import a5.C0423g;
import a6.AbstractC0436k;
import a6.AbstractC0438m;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Typeface;
import android.media.Image;
import android.media.ImageReader;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import b2.r;
import b3.h;
import c.s;
import c0.v;
import com.buzbuz.smartautoclicker.R;
import com.buzbuz.smartautoclicker.core.ui.views.clickoffset.ClickOffsetView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import d0.C0592a;
import d0.C0593b;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import f6.AbstractC0720j;
import f7.C0722b;
import f7.C0725e;
import h1.f;
import h4.AbstractC0832f;
import h6.AbstractC0837b;
import j2.C0902b;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import k2.C0952b;
import k7.C0995a;
import k7.i;
import k7.q;
import k7.x;
import l1.C0999a;
import l2.C1001a;
import n6.InterfaceC1163b;
import n6.InterfaceC1165d;
import n6.InterfaceC1167f;
import o.p1;
import o2.C1229a;
import q1.C1353a;
import t.j;
import t6.C1588c;
import v7.e;
import v7.k;
import w7.AbstractC1759v;

/* loaded from: classes.dex */
public final class a implements M0.a, n, l, m {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f279d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f280e;

    /* renamed from: f, reason: collision with root package name */
    public Object f281f;

    /* renamed from: g, reason: collision with root package name */
    public Object f282g;

    /* renamed from: h, reason: collision with root package name */
    public Object f283h;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, int i4) {
        this.f279d = i4;
        this.f280e = obj;
        this.f281f = obj2;
        this.f282g = obj3;
        this.f283h = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0073, code lost:
    
        if (r0 == r9) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, C1001a c1001a, AbstractC0713c abstractC0713c) {
        W4.c cVar;
        Object obj;
        int i4;
        Object obj2;
        long j;
        C1001a c1001a2;
        ArrayList arrayList;
        C0902b c0902b;
        f fVar;
        long j5;
        C1001a c1001a3 = c1001a;
        r rVar = (r) aVar.f280e;
        if (abstractC0713c instanceof W4.c) {
            cVar = (W4.c) abstractC0713c;
            int i8 = cVar.k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar.k = i8 - Integer.MIN_VALUE;
                obj = cVar.f6588i;
                i4 = cVar.k;
                long j8 = 0;
                obj2 = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            ArrayList arrayList2 = cVar.f6587h;
                            C1001a c1001a4 = cVar.f6586g;
                            Z5.a.d(obj);
                            arrayList = arrayList2;
                            c1001a2 = c1001a4;
                            int size = ((List) obj).size();
                            int i9 = c1001a2.f12192c;
                            fVar = c1001a2.f12196g;
                            if (fVar == null) {
                                j5 = fVar.f11322a;
                            } else {
                                j5 = 0;
                            }
                            if (fVar != null) {
                                j8 = fVar.f11323b;
                            }
                            return new g(c1001a2, false, false, false, j5, j8, arrayList, size, i9);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1001a3 = cVar.f6586g;
                    Z5.a.d(obj);
                } else {
                    Z5.a.d(obj);
                    if (c1001a3.f12195f == 0) {
                        f fVar2 = c1001a3.f12196g;
                        if (fVar2 != null) {
                            j = fVar2.f11322a;
                        } else {
                            j = 0;
                        }
                        if (fVar2 != null) {
                            j8 = fVar2.f11323b;
                        }
                        return new Z4.c(c1001a3, j, j8);
                    }
                    long j9 = c1001a3.f12190a.f12187a;
                    cVar.f6586g = c1001a3;
                    cVar.k = 1;
                    obj = rVar.e(j9, cVar);
                }
                Iterable<C0952b> iterable = (Iterable) obj;
                ArrayList arrayList3 = new ArrayList(AbstractC0438m.d0(iterable, 10));
                for (C0952b c0952b : iterable) {
                    C0999a c0999a = c0952b.f11959a;
                    List list = c0952b.f11964f;
                    long j10 = c0999a.f12187a;
                    String str = c0952b.f11961c;
                    int size2 = c0952b.f11963e.size();
                    int size3 = list.size();
                    if (!list.isEmpty()) {
                        c0902b = (C0902b) AbstractC0436k.p0(list);
                    } else {
                        c0902b = null;
                    }
                    arrayList3.add(new Z4.f(j10, str, size2, size3, c0902b));
                }
                long j11 = c1001a3.f12190a.f12187a;
                cVar.f6586g = c1001a3;
                cVar.f6587h = arrayList3;
                cVar.k = 2;
                obj = rVar.g(j11, cVar);
                if (obj != obj2) {
                    c1001a2 = c1001a3;
                    arrayList = arrayList3;
                    int size4 = ((List) obj).size();
                    int i92 = c1001a2.f12192c;
                    fVar = c1001a2.f12196g;
                    if (fVar == null) {
                    }
                    if (fVar != null) {
                    }
                    return new g(c1001a2, false, false, false, j5, j8, arrayList, size4, i92);
                }
                return obj2;
            }
        }
        cVar = new W4.c(aVar, abstractC0713c);
        obj = cVar.f6588i;
        i4 = cVar.k;
        long j82 = 0;
        obj2 = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
        Iterable<C0952b> iterable2 = (Iterable) obj;
        ArrayList arrayList32 = new ArrayList(AbstractC0438m.d0(iterable2, 10));
        while (r0.hasNext()) {
        }
        long j112 = c1001a3.f12190a.f12187a;
        cVar.f6586g = c1001a3;
        cVar.f6587h = arrayList32;
        cVar.k = 2;
        obj = rVar.g(j112, cVar);
        if (obj != obj2) {
        }
        return obj2;
    }

    public static a c(View view) {
        int i4 = R.id.chevron;
        if (((AppCompatImageView) E2.b.r(view, R.id.chevron)) != null) {
            i4 = R.id.empty_description;
            MaterialTextView materialTextView = (MaterialTextView) E2.b.r(view, R.id.empty_description);
            if (materialTextView != null) {
                i4 = R.id.list;
                RecyclerView recyclerView = (RecyclerView) E2.b.r(view, R.id.list);
                if (recyclerView != null) {
                    i4 = R.id.title;
                    MaterialTextView materialTextView2 = (MaterialTextView) E2.b.r(view, R.id.title);
                    if (materialTextView2 != null) {
                        return new a((ConstraintLayout) view, materialTextView, recyclerView, materialTextView2, 8);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    public static a d(View view) {
        int i4 = R.id.buttonLeft;
        MaterialButton materialButton = (MaterialButton) E2.b.r(view, R.id.buttonLeft);
        if (materialButton != null) {
            i4 = R.id.buttonMiddle;
            MaterialButton materialButton2 = (MaterialButton) E2.b.r(view, R.id.buttonMiddle);
            if (materialButton2 != null) {
                i4 = R.id.buttonRight;
                MaterialButton materialButton3 = (MaterialButton) E2.b.r(view, R.id.buttonRight);
                if (materialButton3 != null) {
                    return new a((MaterialButtonToggleGroup) view, materialButton, materialButton2, materialButton3, 11);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    public static a e(View view) {
        int i4 = R.id.button_checkbox;
        MaterialButton materialButton = (MaterialButton) E2.b.r(view, R.id.button_checkbox);
        if (materialButton != null) {
            i4 = R.id.edit_text_field_layout;
            TextInputLayout textInputLayout = (TextInputLayout) E2.b.r(view, R.id.edit_text_field_layout);
            if (textInputLayout != null) {
                i4 = R.id.text_field;
                TextInputEditText textInputEditText = (TextInputEditText) E2.b.r(view, R.id.text_field);
                if (textInputEditText != null) {
                    return new a((ConstraintLayout) view, materialButton, textInputLayout, textInputEditText, 14);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    public static a f(View view) {
        int i4 = R.id.disabled_touch_handler;
        View r8 = E2.b.r(view, R.id.disabled_touch_handler);
        if (r8 != null) {
            i4 = R.id.text_field;
            MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) E2.b.r(view, R.id.text_field);
            if (materialAutoCompleteTextView != null) {
                i4 = R.id.text_layout;
                TextInputLayout textInputLayout = (TextInputLayout) E2.b.r(view, R.id.text_layout);
                if (textInputLayout != null) {
                    return new a((FrameLayout) view, r8, materialAutoCompleteTextView, textInputLayout, 15);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @Override // Y6.l
    public l B(C0722b c0722b, C0725e c0725e) {
        return ((p1) this.f280e).B(c0722b, c0725e);
    }

    @Override // Y6.m
    public l C(C0722b c0722b) {
        ArrayList arrayList = new ArrayList();
        return new a(((F3.a) this.f281f).w(c0722b, O.f726a, arrayList), this, arrayList);
    }

    @Override // Y6.m
    public void V(C0722b c0722b, C0725e c0725e) {
        ((ArrayList) this.f280e).add(new i(c0722b, c0725e));
    }

    @Override // Y6.m
    public void X(k7.f fVar) {
        ((ArrayList) this.f280e).add(new k7.g(new q(fVar)));
    }

    @Override // Y6.n
    public l a(C0722b c0722b, H6.a aVar) {
        return ((F3.a) ((R3.r) this.f282g).f5082e).x(c0722b, aVar, (ArrayList) this.f281f);
    }

    public void g(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) ((j) this.f281f).get(obj);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    g(arrayList2.get(i4), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    @Override // M0.a
    public View getRoot() {
        switch (this.f279d) {
            case 0:
                return (LinearLayout) this.f280e;
            case 1:
                return (MaterialCardView) this.f280e;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
            default:
                return (MaterialCardView) this.f280e;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return (NestedScrollView) this.f280e;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return (LinearLayout) this.f280e;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return (LinearLayout) this.f280e;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                return (LinearLayout) this.f280e;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                return (ConstraintLayout) this.f280e;
            case 9:
                return (ConstraintLayout) this.f280e;
            case 10:
                return (ConstraintLayout) this.f280e;
            case 11:
                return (MaterialButtonToggleGroup) this.f280e;
            case 12:
                return (ConstraintLayout) this.f280e;
            case 13:
                return (ConstraintLayout) this.f280e;
            case 14:
                return (ConstraintLayout) this.f280e;
            case 15:
                return (FrameLayout) this.f280e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(AbstractC0713c abstractC0713c) {
        C0340h c0340h;
        int i4;
        a aVar;
        C0334b c0334b;
        H h8 = (H) this.f283h;
        if (abstractC0713c instanceof C0340h) {
            c0340h = (C0340h) abstractC0713c;
            int i8 = c0340h.j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0340h.j = i8 - Integer.MIN_VALUE;
                Object obj = c0340h.f6735h;
                i4 = c0340h.j;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            aVar = c0340h.f6734g;
                            Z5.a.d(obj);
                            c0334b = (C0334b) obj;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        aVar = c0340h.f6734g;
                        Z5.a.d(obj);
                        c0334b = (C0334b) obj;
                    }
                } else {
                    Z5.a.d(obj);
                    List list = (List) this.f282g;
                    EnumC0646a enumC0646a = EnumC0646a.f10656d;
                    if (list != null && !list.isEmpty()) {
                        b0 h9 = h8.h();
                        C0343k c0343k = new C0343k(h8, this, null);
                        c0340h.f6734g = this;
                        c0340h.j = 2;
                        obj = h9.b(c0343k, c0340h);
                        if (obj != enumC0646a) {
                            aVar = this;
                            c0334b = (C0334b) obj;
                        }
                    } else {
                        c0340h.f6734g = this;
                        c0340h.j = 1;
                        obj = H.f(h8, false, c0340h);
                        if (obj != enumC0646a) {
                            aVar = this;
                            c0334b = (C0334b) obj;
                        }
                    }
                    return enumC0646a;
                }
                ((H) aVar.f283h).k.d(c0334b);
                return y.f7506a;
            }
        }
        c0340h = new C0340h(this, abstractC0713c);
        Object obj2 = c0340h.f6735h;
        i4 = c0340h.j;
        if (i4 == 0) {
        }
        ((H) aVar.f283h).k.d(c0334b);
        return y.f7506a;
    }

    public InterfaceC0004e i(C0722b c0722b, List list) {
        o6.j.e(c0722b, "classId");
        return (InterfaceC0004e) ((e) this.f283h).m(new D(c0722b, list));
    }

    public Bitmap j() {
        ImageReader imageReader = (ImageReader) this.f281f;
        if (imageReader == null) {
            Log.e("ImageReaderProxy", "Can't get last frame, ImageReader is null");
            return null;
        }
        Image acquireLatestImage = imageReader.acquireLatestImage();
        if (acquireLatestImage != null) {
            try {
                Bitmap s8 = s(acquireLatestImage);
                this.f282g = s8;
                AbstractC0837b.d(acquireLatestImage, null);
                return s8;
            } finally {
            }
        } else {
            return (Bitmap) this.f282g;
        }
    }

    @Override // Y6.l, Y6.m
    public void k() {
        switch (this.f279d) {
            case 25:
                ArrayList arrayList = (ArrayList) this.f281f;
                if (!arrayList.isEmpty()) {
                    ((HashMap) ((R3.r) this.f282g).f5083f).put((p) this.f280e, arrayList);
                    return;
                }
                return;
            case 26:
                ((p1) this.f281f).k();
                ((ArrayList) ((a) this.f282g).f280e).add(new C0995a((D6.c) AbstractC0436k.G0((ArrayList) this.f283h)));
                return;
            default:
                p1 p1Var = (p1) this.f283h;
                C0725e c0725e = (C0725e) this.f282g;
                ArrayList arrayList2 = (ArrayList) this.f280e;
                p1Var.getClass();
                o6.j.e(arrayList2, "elements");
                if (c0725e != null) {
                    U z8 = AbstractC0405a.z(c0725e, (InterfaceC0004e) p1Var.f13352h);
                    if (z8 != null) {
                        HashMap hashMap = (HashMap) p1Var.f13350f;
                        List d2 = F7.l.d(arrayList2);
                        AbstractC1759v b4 = z8.b();
                        o6.j.d(b4, "getType(...)");
                        hashMap.put(c0725e, new x(d2, b4));
                        return;
                    }
                    if (((F3.a) p1Var.f13351g).v((C0722b) p1Var.f13353i) && o6.j.a(c0725e.b(), "value")) {
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (next instanceof C0995a) {
                                arrayList3.add(next);
                            }
                        }
                        List list = (List) p1Var.j;
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            list.add((D6.c) ((C0995a) it2.next()).f12144a);
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // Y6.l
    public void l(C0725e c0725e, C0722b c0722b, C0725e c0725e2) {
        ((p1) this.f280e).l(c0725e, c0722b, c0725e2);
    }

    public C1588c m() {
        Matcher matcher = (Matcher) this.f280e;
        return AbstractC0832f.G(matcher.start(), matcher.end());
    }

    public a n() {
        int i4;
        CharSequence charSequence = (CharSequence) this.f281f;
        Matcher matcher = (Matcher) this.f280e;
        int end = matcher.end();
        if (matcher.end() == matcher.start()) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        int i8 = end + i4;
        if (i8 > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        o6.j.d(matcher2, "matcher(...)");
        if (!matcher2.find(i8)) {
            return null;
        }
        return new a(matcher2, charSequence);
    }

    @Override // Y6.l
    public void o(C0725e c0725e, k7.f fVar) {
        ((p1) this.f280e).o(c0725e, fVar);
    }

    public void p(Point point) {
        o6.j.e(point, "size");
        this.f283h = new int[point.x];
        ImageReader imageReader = (ImageReader) this.f281f;
        if (imageReader != null) {
            imageReader.close();
        }
        this.f281f = ImageReader.newInstance(point.x, point.y, 1, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072 A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:13:0x0080, B:21:0x0064, B:25:0x0072), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [U7.a] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v5, types: [U7.a] */
    /* JADX WARN: Type inference failed for: r1v6, types: [U7.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object q(AbstractC0713c abstractC0713c) {
        V v8;
        ?? r12;
        a aVar;
        U7.c cVar;
        a aVar2;
        try {
            if (abstractC0713c instanceof V) {
                v8 = (V) abstractC0713c;
                int i4 = v8.k;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    v8.k = i4 - Integer.MIN_VALUE;
                    Object obj = v8.f6700i;
                    r12 = v8.k;
                    y yVar = y.f7506a;
                    EnumC0646a enumC0646a = EnumC0646a.f10656d;
                    if (r12 == 0) {
                        if (r12 != 1) {
                            if (r12 == 2) {
                                U7.a aVar3 = v8.f6699h;
                                aVar2 = v8.f6698g;
                                Z5.a.d(obj);
                                r12 = aVar3;
                                ((C0156n) aVar2.f281f).R(yVar);
                                return yVar;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r13 = v8.f6699h;
                        aVar = v8.f6698g;
                        Z5.a.d(obj);
                        cVar = r13;
                    } else {
                        Z5.a.d(obj);
                        if (((C0156n) this.f281f).P()) {
                            return yVar;
                        }
                        U7.c cVar2 = (U7.c) this.f280e;
                        v8.f6698g = this;
                        v8.f6699h = cVar2;
                        v8.k = 1;
                        if (cVar2.d(v8) != enumC0646a) {
                            aVar = this;
                            cVar = cVar2;
                        }
                        return enumC0646a;
                    }
                    if (!((C0156n) aVar.f281f).P()) {
                        return yVar;
                    }
                    v8.f6698g = aVar;
                    v8.f6699h = cVar;
                    v8.k = 2;
                    if (aVar.h(v8) != enumC0646a) {
                        aVar2 = aVar;
                        r12 = cVar;
                        ((C0156n) aVar2.f281f).R(yVar);
                        return yVar;
                    }
                    return enumC0646a;
                }
            }
            if (r12 == 0) {
            }
            if (!((C0156n) aVar.f281f).P()) {
            }
        } finally {
            r12.a(null);
        }
        v8 = new V(this, abstractC0713c);
        Object obj2 = v8.f6700i;
        r12 = v8.k;
        y yVar2 = y.f7506a;
        EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
    }

    @Override // Y6.l
    public void r(C0725e c0725e, Object obj) {
        ((p1) this.f280e).r(c0725e, obj);
    }

    public Bitmap s(Image image) {
        q1.e eVar = (q1.e) this.f280e;
        int width = image.getWidth();
        int height = image.getHeight();
        C1353a c1353a = eVar.f13923a;
        String i4 = A.j.i(width, height, "key:DISPLAY_RECORDER:", ":");
        Bitmap bitmap = (Bitmap) c1353a.get(i4);
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            if (bitmap != null) {
                c1353a.put(i4, bitmap);
            } else {
                bitmap = null;
            }
        }
        Bitmap bitmap2 = bitmap;
        if (bitmap2 != null) {
            if (image.getPlanes()[0].getRowStride() == image.getPlanes()[0].getPixelStride() * image.getWidth() && bitmap2.getWidth() == image.getWidth() && bitmap2.getHeight() == image.getHeight()) {
                try {
                    bitmap2.copyPixelsFromBuffer(image.getPlanes()[0].getBuffer().asReadOnlyBuffer().rewind());
                    return bitmap2;
                } catch (Exception e9) {
                    Log.e("ImageReaderProxy", "Failed to direct copy pixels from buffer", e9);
                }
            }
            int[] iArr = (int[]) this.f283h;
            if (iArr != null) {
                IntBuffer asIntBuffer = image.getPlanes()[0].getBuffer().asIntBuffer();
                int height2 = image.getHeight();
                for (int i8 = 0; i8 < height2; i8++) {
                    asIntBuffer.position((image.getPlanes()[0].getRowStride() * i8) / 4);
                    asIntBuffer.get(iArr);
                    int length = iArr.length;
                    for (int i9 = 0; i9 < length; i9++) {
                        int i10 = iArr[i9];
                        iArr[i9] = ((i10 & 255) << 16) | ((-16711936) & i10) | ((16711680 & i10) >>> 16);
                    }
                    bitmap2.setPixels(iArr, 0, image.getWidth(), 0, i8, image.getWidth(), 1);
                }
            }
            return bitmap2;
        }
        throw new IllegalStateException(A.j.i(width, height, "Can't create display recorder bitmap with size ", "/"));
    }

    public p1 t(int i4, C0722b c0722b, H6.a aVar) {
        p pVar = new p(((p) this.f280e).f7237a + '@' + i4);
        R3.r rVar = (R3.r) this.f283h;
        HashMap hashMap = (HashMap) rVar.f5083f;
        List list = (List) hashMap.get(pVar);
        if (list == null) {
            list = new ArrayList();
            hashMap.put(pVar, list);
        }
        return ((F3.a) rVar.f5082e).x(c0722b, aVar, list);
    }

    @Override // Y6.l
    public m v(C0725e c0725e) {
        return ((p1) this.f280e).v(c0725e);
    }

    @Override // Y6.m
    public void y0(Object obj) {
        ((ArrayList) this.f280e).add(F3.a.a((F3.a) this.f281f, (C0725e) this.f282g, obj));
    }

    public a(k kVar, A a3) {
        this.f279d = 3;
        o6.j.e(a3, "module");
        this.f280e = kVar;
        this.f281f = a3;
        this.f282g = kVar.b(new C(this, 0));
        this.f283h = kVar.b(new C(this, 1));
    }

    public a(Q7.d dVar, s sVar, E e9) {
        this.f279d = 24;
        this.f280e = dVar;
        this.f281f = e9;
        this.f282g = E2.c.H(Integer.MAX_VALUE, 6, null);
        this.f283h = new W0.c(19);
        X x8 = (X) dVar.f4940d.B(C0161t.f3244e);
        if (x8 != null) {
            x8.j(new W(sVar, this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(InterfaceC1165d interfaceC1165d, InterfaceC1167f interfaceC1167f, InterfaceC1163b interfaceC1163b, h hVar) {
        this.f279d = 21;
        this.f280e = (AbstractC0720j) interfaceC1165d;
        this.f281f = (AbstractC0720j) interfaceC1167f;
        this.f282g = (AbstractC0720j) interfaceC1163b;
        this.f283h = hVar;
    }

    public a(q1.e eVar) {
        this.f279d = 28;
        o6.j.e(eVar, "bitmapRepository");
        this.f280e = eVar;
    }

    public a(LinearLayout linearLayout, d dVar, b bVar, b bVar2, b bVar3) {
        this.f279d = 0;
        this.f280e = linearLayout;
        this.f281f = bVar;
        this.f282g = bVar2;
        this.f283h = bVar3;
    }

    public a(int i4) {
        this.f279d = i4;
        switch (i4) {
            case 18:
                this.f280e = new j(0);
                this.f281f = new SparseArray();
                this.f282g = new t.g((Object) null);
                this.f283h = new j(0);
                return;
            default:
                this.f280e = new O.c(10);
                this.f281f = new j(0);
                this.f282g = new ArrayList();
                this.f283h = new HashSet();
                return;
        }
    }

    public a(LinearLayout linearLayout, A.i iVar, A.i iVar2, d dVar, ClickOffsetView clickOffsetView) {
        this.f279d = 6;
        this.f280e = linearLayout;
        this.f281f = iVar;
        this.f282g = iVar2;
        this.f283h = clickOffsetView;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [n6.f, f6.j] */
    public a(Context context, C1229a c1229a, C0423g c0423g, x2.f fVar, r rVar) {
        this.f279d = 22;
        o6.j.e(c1229a, "dumbRepository");
        o6.j.e(c0423g, "sortConfigRepository");
        o6.j.e(fVar, "settingsRepository");
        o6.j.e(rVar, "smartRepository");
        this.f280e = rVar;
        i0 c6 = O7.V.c(null);
        this.f281f = c6;
        O7.U b4 = O7.V.b(6);
        this.f282g = b4;
        this.f283h = new L(new InterfaceC0233f[]{O7.V.h(b4, c1229a.f13441b, rVar.f9114d, new W4.a(this, context, null)), c6, new C4.e((InterfaceC0233f) c0423g.f7749a.f5083f, 22), fVar.f16111i}, (InterfaceC1167f) new AbstractC0720j(5, null));
        b4.t(y.f7506a);
    }

    public a(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, TextView textView2, TextView textView3) {
        this.f279d = 12;
        this.f280e = constraintLayout;
        this.f281f = textView;
        this.f282g = textView2;
        this.f283h = textView3;
    }

    public a(NestedScrollView nestedScrollView, c cVar, c cVar2, c cVar3, c cVar4) {
        this.f279d = 4;
        this.f280e = nestedScrollView;
        this.f281f = cVar;
        this.f282g = cVar2;
        this.f283h = cVar3;
    }

    public a(Typeface typeface, C0593b c0593b) {
        int i4;
        int i8;
        int i9;
        int i10;
        this.f279d = 29;
        this.f283h = typeface;
        this.f280e = c0593b;
        this.f282g = new v(1024);
        int b4 = c0593b.b(6);
        if (b4 != 0) {
            int i11 = b4 + c0593b.f4203d;
            i4 = ((ByteBuffer) c0593b.f4206g).getInt(((ByteBuffer) c0593b.f4206g).getInt(i11) + i11);
        } else {
            i4 = 0;
        }
        this.f281f = new char[i4 * 2];
        int b9 = c0593b.b(6);
        if (b9 != 0) {
            int i12 = b9 + c0593b.f4203d;
            i8 = ((ByteBuffer) c0593b.f4206g).getInt(((ByteBuffer) c0593b.f4206g).getInt(i12) + i12);
        } else {
            i8 = 0;
        }
        for (int i13 = 0; i13 < i8; i13++) {
            c0.y yVar = new c0.y(this, i13);
            C0592a b10 = yVar.b();
            int b11 = b10.b(4);
            Character.toChars(b11 != 0 ? ((ByteBuffer) b10.f4206g).getInt(b11 + b10.f4203d) : 0, (char[]) this.f281f, i13 * 2);
            C0592a b12 = yVar.b();
            int b13 = b12.b(16);
            if (b13 != 0) {
                int i14 = b13 + b12.f4203d;
                i9 = ((ByteBuffer) b12.f4206g).getInt(((ByteBuffer) b12.f4206g).getInt(i14) + i14);
            } else {
                i9 = 0;
            }
            AbstractC0405a.i("invalid metadata codepoint length", i9 > 0);
            v vVar = (v) this.f282g;
            C0592a b14 = yVar.b();
            int b15 = b14.b(16);
            if (b15 != 0) {
                int i15 = b15 + b14.f4203d;
                i10 = ((ByteBuffer) b14.f4206g).getInt(((ByteBuffer) b14.f4206g).getInt(i15) + i15);
            } else {
                i10 = 0;
            }
            vVar.a(yVar, 0, i10 - 1);
        }
    }

    public a(R3.r rVar, p pVar) {
        this.f279d = 25;
        this.f283h = rVar;
        this.f279d = 25;
        this.f282g = rVar;
        this.f280e = pVar;
        this.f281f = new ArrayList();
    }

    public a(S6.a aVar, S6.f fVar, Z5.g gVar) {
        this.f279d = 19;
        o6.j.e(fVar, "typeParameterResolver");
        this.f280e = aVar;
        this.f281f = fVar;
        this.f282g = gVar;
        this.f283h = new R.g(this, fVar);
    }

    public a(F3.a aVar, C0725e c0725e, p1 p1Var) {
        this.f279d = 27;
        this.f281f = aVar;
        this.f282g = c0725e;
        this.f283h = p1Var;
        this.f280e = new ArrayList();
    }

    public a(p1 p1Var, a aVar, ArrayList arrayList) {
        this.f279d = 26;
        this.f281f = p1Var;
        this.f282g = aVar;
        this.f283h = arrayList;
        this.f280e = p1Var;
    }

    public a(Matcher matcher, CharSequence charSequence) {
        this.f279d = 17;
        o6.j.e(charSequence, "input");
        this.f280e = matcher;
        this.f281f = charSequence;
        this.f282g = new I7.j(this);
    }

    public a(H h8, List list) {
        this.f279d = 23;
        this.f283h = h8;
        this.f280e = new U7.c();
        this.f281f = AbstractC0166y.a();
        this.f282g = AbstractC0436k.Q0(list);
    }
}
