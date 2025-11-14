package androidx.constraintlayout.widget;

import A.c;
import A.f;
import A.g;
import A.h;
import A.i;
import A.p;
import A.q;
import A.s;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import x.C1766e;
import y.d;
import y.e;
import z.C1846c;
import z.C1848e;
import z.C1849f;
import z.C1850g;
import z.j;
import z.l;
import z.m;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f8515s = 0;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f8516d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f8517e;

    /* renamed from: f, reason: collision with root package name */
    public final e f8518f;

    /* renamed from: g, reason: collision with root package name */
    public int f8519g;

    /* renamed from: h, reason: collision with root package name */
    public int f8520h;

    /* renamed from: i, reason: collision with root package name */
    public int f8521i;
    public int j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public int f8522l;

    /* renamed from: m, reason: collision with root package name */
    public p f8523m;

    /* renamed from: n, reason: collision with root package name */
    public i f8524n;

    /* renamed from: o, reason: collision with root package name */
    public int f8525o;

    /* renamed from: p, reason: collision with root package name */
    public HashMap f8526p;

    /* renamed from: q, reason: collision with root package name */
    public final SparseArray f8527q;

    /* renamed from: r, reason: collision with root package name */
    public final f f8528r;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8516d = new SparseArray();
        this.f8517e = new ArrayList(4);
        this.f8518f = new e();
        this.f8519g = 0;
        this.f8520h = 0;
        this.f8521i = Integer.MAX_VALUE;
        this.j = Integer.MAX_VALUE;
        this.k = true;
        this.f8522l = 263;
        this.f8523m = null;
        this.f8524n = null;
        this.f8525o = -1;
        this.f8526p = new HashMap();
        this.f8527q = new SparseArray();
        this.f8528r = new f(this);
        b(attributeSet, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    public final d a(View view) {
        if (view == this) {
            return this.f8518f;
        }
        if (view == null) {
            return null;
        }
        return ((A.e) view.getLayoutParams()).f56k0;
    }

    public final void b(AttributeSet attributeSet, int i4) {
        e eVar = this.f8518f;
        eVar.f16352U = this;
        f fVar = this.f8528r;
        eVar.f16387g0 = fVar;
        eVar.f16386f0.f16588f = fVar;
        this.f8516d.put(getId(), this);
        this.f8523m = null;
        boolean z8 = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.f179b, i4, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == 9) {
                    this.f8519g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f8519g);
                } else if (index == 10) {
                    this.f8520h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f8520h);
                } else if (index == 7) {
                    this.f8521i = obtainStyledAttributes.getDimensionPixelOffset(index, this.f8521i);
                } else if (index == 8) {
                    this.j = obtainStyledAttributes.getDimensionPixelOffset(index, this.j);
                } else if (index == 89) {
                    this.f8522l = obtainStyledAttributes.getInt(index, this.f8522l);
                } else if (index == 38) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            c(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f8524n = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        p pVar = new p();
                        this.f8523m = pVar;
                        pVar.f(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f8523m = null;
                    }
                    this.f8525o = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        int i9 = this.f8522l;
        eVar.f16395p0 = i9;
        if ((i9 & 256) == 256) {
            z8 = true;
        }
        C1766e.f16040p = z8;
    }

    public final void c(int i4) {
        char c6;
        Context context = getContext();
        i iVar = new i(0);
        iVar.f88e = new SparseArray();
        iVar.f89f = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i4);
        try {
            g gVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        String name = xml.getName();
                        switch (name.hashCode()) {
                            case -1349929691:
                                if (name.equals("ConstraintSet")) {
                                    c6 = 4;
                                    break;
                                }
                                break;
                            case 80204913:
                                if (name.equals("State")) {
                                    c6 = 2;
                                    break;
                                }
                                break;
                            case 1382829617:
                                if (name.equals("StateSet")) {
                                    c6 = 1;
                                    break;
                                }
                                break;
                            case 1657696882:
                                if (name.equals("layoutDescription")) {
                                    c6 = 0;
                                    break;
                                }
                                break;
                            case 1901439077:
                                if (name.equals("Variant")) {
                                    c6 = 3;
                                    break;
                                }
                                break;
                        }
                        c6 = 65535;
                        if (c6 != 0 && c6 != 1) {
                            if (c6 != 2) {
                                if (c6 != 3) {
                                    if (c6 == 4) {
                                        iVar.g(context, xml);
                                    }
                                } else {
                                    h hVar = new h(context, xml);
                                    if (gVar != null) {
                                        ((ArrayList) gVar.f81f).add(hVar);
                                    }
                                }
                            } else {
                                gVar = new g(context, xml);
                                ((SparseArray) iVar.f88e).put(gVar.f79d, gVar);
                            }
                        }
                    }
                } else {
                    xml.getName();
                }
            }
        } catch (IOException e9) {
            e9.printStackTrace();
        } catch (XmlPullParserException e10) {
            e10.printStackTrace();
        }
        this.f8524n = iVar;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof A.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f8517e;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                ((c) arrayList.get(i4)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i9 = (int) ((parseInt / 1080.0f) * width);
                        int i10 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f8 = i9;
                        float f9 = i10;
                        float f10 = i9 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f8, f9, f10, f9, paint);
                        float parseInt4 = i10 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f10, f9, f10, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f8, parseInt4, paint);
                        canvas.drawLine(f8, parseInt4, f8, f9, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f8, f9, f10, parseInt4, paint);
                        canvas.drawLine(f8, parseInt4, f10, f9, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.k = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new A.e(-2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, A.e] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        int i4;
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f38a = -1;
        marginLayoutParams.f40b = -1;
        marginLayoutParams.f42c = -1.0f;
        marginLayoutParams.f44d = -1;
        marginLayoutParams.f46e = -1;
        marginLayoutParams.f48f = -1;
        marginLayoutParams.f50g = -1;
        marginLayoutParams.f52h = -1;
        marginLayoutParams.f54i = -1;
        marginLayoutParams.j = -1;
        marginLayoutParams.k = -1;
        marginLayoutParams.f57l = -1;
        marginLayoutParams.f58m = -1;
        marginLayoutParams.f59n = 0;
        marginLayoutParams.f60o = 0.0f;
        marginLayoutParams.f61p = -1;
        marginLayoutParams.f62q = -1;
        marginLayoutParams.f63r = -1;
        marginLayoutParams.f64s = -1;
        marginLayoutParams.f65t = -1;
        marginLayoutParams.f66u = -1;
        marginLayoutParams.f67v = -1;
        marginLayoutParams.f68w = -1;
        marginLayoutParams.f69x = -1;
        marginLayoutParams.f70y = -1;
        marginLayoutParams.f71z = 0.5f;
        marginLayoutParams.f14A = 0.5f;
        marginLayoutParams.f15B = null;
        marginLayoutParams.f16C = 1;
        marginLayoutParams.f17D = -1.0f;
        marginLayoutParams.f18E = -1.0f;
        marginLayoutParams.f19F = 0;
        marginLayoutParams.f20G = 0;
        marginLayoutParams.f21H = 0;
        marginLayoutParams.f22I = 0;
        marginLayoutParams.f23J = 0;
        marginLayoutParams.K = 0;
        marginLayoutParams.f24L = 0;
        marginLayoutParams.f25M = 0;
        marginLayoutParams.f26N = 1.0f;
        marginLayoutParams.f27O = 1.0f;
        marginLayoutParams.f28P = -1;
        marginLayoutParams.f29Q = -1;
        marginLayoutParams.f30R = -1;
        marginLayoutParams.f31S = false;
        marginLayoutParams.f32T = false;
        marginLayoutParams.f33U = null;
        marginLayoutParams.f34V = true;
        marginLayoutParams.f35W = true;
        marginLayoutParams.f36X = false;
        marginLayoutParams.Y = false;
        marginLayoutParams.f37Z = false;
        marginLayoutParams.f39a0 = -1;
        marginLayoutParams.f41b0 = -1;
        marginLayoutParams.f43c0 = -1;
        marginLayoutParams.f45d0 = -1;
        marginLayoutParams.f47e0 = -1;
        marginLayoutParams.f49f0 = -1;
        marginLayoutParams.f51g0 = 0.5f;
        marginLayoutParams.f56k0 = new d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f179b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i8 = 0; i8 < indexCount; i8++) {
            int index = obtainStyledAttributes.getIndex(i8);
            int i9 = A.d.f13a.get(index);
            switch (i9) {
                case 1:
                    marginLayoutParams.f30R = obtainStyledAttributes.getInt(index, marginLayoutParams.f30R);
                    break;
                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                    int resourceId = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f58m);
                    marginLayoutParams.f58m = resourceId;
                    if (resourceId == -1) {
                        marginLayoutParams.f58m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                    marginLayoutParams.f59n = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f59n);
                    break;
                case Z.g.LONG_FIELD_NUMBER /* 4 */:
                    float f8 = obtainStyledAttributes.getFloat(index, marginLayoutParams.f60o) % 360.0f;
                    marginLayoutParams.f60o = f8;
                    if (f8 < 0.0f) {
                        marginLayoutParams.f60o = (360.0f - f8) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case Z.g.STRING_FIELD_NUMBER /* 5 */:
                    marginLayoutParams.f38a = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f38a);
                    break;
                case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                    marginLayoutParams.f40b = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f40b);
                    break;
                case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                    marginLayoutParams.f42c = obtainStyledAttributes.getFloat(index, marginLayoutParams.f42c);
                    break;
                case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f44d);
                    marginLayoutParams.f44d = resourceId2;
                    if (resourceId2 == -1) {
                        marginLayoutParams.f44d = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f46e);
                    marginLayoutParams.f46e = resourceId3;
                    if (resourceId3 == -1) {
                        marginLayoutParams.f46e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f48f);
                    marginLayoutParams.f48f = resourceId4;
                    if (resourceId4 == -1) {
                        marginLayoutParams.f48f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f50g);
                    marginLayoutParams.f50g = resourceId5;
                    if (resourceId5 == -1) {
                        marginLayoutParams.f50g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f52h);
                    marginLayoutParams.f52h = resourceId6;
                    if (resourceId6 == -1) {
                        marginLayoutParams.f52h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f54i);
                    marginLayoutParams.f54i = resourceId7;
                    if (resourceId7 == -1) {
                        marginLayoutParams.f54i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.j);
                    marginLayoutParams.j = resourceId8;
                    if (resourceId8 == -1) {
                        marginLayoutParams.j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.k);
                    marginLayoutParams.k = resourceId9;
                    if (resourceId9 == -1) {
                        marginLayoutParams.k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f57l);
                    marginLayoutParams.f57l = resourceId10;
                    if (resourceId10 == -1) {
                        marginLayoutParams.f57l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f61p);
                    marginLayoutParams.f61p = resourceId11;
                    if (resourceId11 == -1) {
                        marginLayoutParams.f61p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f62q);
                    marginLayoutParams.f62q = resourceId12;
                    if (resourceId12 == -1) {
                        marginLayoutParams.f62q = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f63r);
                    marginLayoutParams.f63r = resourceId13;
                    if (resourceId13 == -1) {
                        marginLayoutParams.f63r = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f64s);
                    marginLayoutParams.f64s = resourceId14;
                    if (resourceId14 == -1) {
                        marginLayoutParams.f64s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    marginLayoutParams.f65t = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f65t);
                    break;
                case 22:
                    marginLayoutParams.f66u = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f66u);
                    break;
                case 23:
                    marginLayoutParams.f67v = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f67v);
                    break;
                case 24:
                    marginLayoutParams.f68w = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f68w);
                    break;
                case 25:
                    marginLayoutParams.f69x = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f69x);
                    break;
                case 26:
                    marginLayoutParams.f70y = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f70y);
                    break;
                case 27:
                    marginLayoutParams.f31S = obtainStyledAttributes.getBoolean(index, marginLayoutParams.f31S);
                    break;
                case 28:
                    marginLayoutParams.f32T = obtainStyledAttributes.getBoolean(index, marginLayoutParams.f32T);
                    break;
                case 29:
                    marginLayoutParams.f71z = obtainStyledAttributes.getFloat(index, marginLayoutParams.f71z);
                    break;
                case 30:
                    marginLayoutParams.f14A = obtainStyledAttributes.getFloat(index, marginLayoutParams.f14A);
                    break;
                case 31:
                    int i10 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.f21H = i10;
                    if (i10 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i11 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.f22I = i11;
                    if (i11 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        marginLayoutParams.f23J = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f23J);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f23J) == -2) {
                            marginLayoutParams.f23J = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        marginLayoutParams.f24L = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f24L);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f24L) == -2) {
                            marginLayoutParams.f24L = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    marginLayoutParams.f26N = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.f26N));
                    marginLayoutParams.f21H = 2;
                    break;
                case 36:
                    try {
                        marginLayoutParams.K = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.K);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.K) == -2) {
                            marginLayoutParams.K = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        marginLayoutParams.f25M = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f25M);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f25M) == -2) {
                            marginLayoutParams.f25M = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    marginLayoutParams.f27O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.f27O));
                    marginLayoutParams.f22I = 2;
                    break;
                default:
                    switch (i9) {
                        case 44:
                            String string = obtainStyledAttributes.getString(index);
                            marginLayoutParams.f15B = string;
                            marginLayoutParams.f16C = -1;
                            if (string != null) {
                                int length = string.length();
                                int indexOf = marginLayoutParams.f15B.indexOf(44);
                                if (indexOf <= 0 || indexOf >= length - 1) {
                                    i4 = 0;
                                } else {
                                    String substring = marginLayoutParams.f15B.substring(0, indexOf);
                                    if (substring.equalsIgnoreCase("W")) {
                                        marginLayoutParams.f16C = 0;
                                    } else if (substring.equalsIgnoreCase("H")) {
                                        marginLayoutParams.f16C = 1;
                                    }
                                    i4 = indexOf + 1;
                                }
                                int indexOf2 = marginLayoutParams.f15B.indexOf(58);
                                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                    String substring2 = marginLayoutParams.f15B.substring(i4, indexOf2);
                                    String substring3 = marginLayoutParams.f15B.substring(indexOf2 + 1);
                                    if (substring2.length() > 0 && substring3.length() > 0) {
                                        try {
                                            float parseFloat = Float.parseFloat(substring2);
                                            float parseFloat2 = Float.parseFloat(substring3);
                                            if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                if (marginLayoutParams.f16C == 1) {
                                                    Math.abs(parseFloat2 / parseFloat);
                                                    break;
                                                } else {
                                                    Math.abs(parseFloat / parseFloat2);
                                                    break;
                                                }
                                            }
                                        } catch (NumberFormatException unused5) {
                                            break;
                                        }
                                    }
                                } else {
                                    String substring4 = marginLayoutParams.f15B.substring(i4);
                                    if (substring4.length() > 0) {
                                        Float.parseFloat(substring4);
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                            } else {
                                break;
                            }
                            break;
                        case 45:
                            marginLayoutParams.f17D = obtainStyledAttributes.getFloat(index, marginLayoutParams.f17D);
                            break;
                        case 46:
                            marginLayoutParams.f18E = obtainStyledAttributes.getFloat(index, marginLayoutParams.f18E);
                            break;
                        case 47:
                            marginLayoutParams.f19F = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            marginLayoutParams.f20G = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            marginLayoutParams.f28P = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f28P);
                            break;
                        case 50:
                            marginLayoutParams.f29Q = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f29Q);
                            break;
                        case 51:
                            marginLayoutParams.f33U = obtainStyledAttributes.getString(index);
                            break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
        marginLayoutParams.a();
        return marginLayoutParams;
    }

    public int getMaxHeight() {
        return this.j;
    }

    public int getMaxWidth() {
        return this.f8521i;
    }

    public int getMinHeight() {
        return this.f8520h;
    }

    public int getMinWidth() {
        return this.f8519g;
    }

    public int getOptimizationLevel() {
        return this.f8518f.f16395p0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i4, int i8, int i9, int i10) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            A.e eVar = (A.e) childAt.getLayoutParams();
            d dVar = eVar.f56k0;
            if (childAt.getVisibility() != 8 || eVar.Y || eVar.f37Z || isInEditMode) {
                int m6 = dVar.m();
                int n3 = dVar.n();
                childAt.layout(m6, n3, dVar.l() + m6, dVar.i() + n3);
            }
        }
        ArrayList arrayList = this.f8517e;
        int size = arrayList.size();
        if (size > 0) {
            for (int i12 = 0; i12 < size; i12++) {
                ((c) arrayList.get(i12)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:270:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0824 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:403:0x082f  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x097f  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x099c  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0a7a  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0d1b  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0d1e  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0a7f  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0af8  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0afd  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x0cde  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0ce0  */
    /* JADX WARN: Removed duplicated region for block: B:692:0x0a6e  */
    /* JADX WARN: Removed duplicated region for block: B:716:0x07ac  */
    /* JADX WARN: Removed duplicated region for block: B:717:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:718:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:719:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:727:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:738:0x06e0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i4, int i8) {
        boolean z8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int l6;
        C1848e c1848e;
        char c6;
        int i18;
        int i19;
        boolean z9;
        f fVar;
        boolean z10;
        boolean z11;
        int i20;
        int i21;
        boolean z12;
        e eVar;
        ArrayList arrayList;
        f fVar2;
        int i22;
        boolean z13;
        int i23;
        int i24;
        int size;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        int i25;
        int i26;
        f fVar3;
        int i27;
        boolean z19;
        boolean z20;
        boolean z21;
        f fVar4;
        boolean z22;
        boolean z23;
        int i28;
        int i29;
        boolean z24;
        boolean z25;
        boolean z26;
        int i30;
        boolean z27;
        int i31;
        int i32;
        int i33;
        boolean z28;
        Iterator it;
        Iterator it2;
        boolean z29;
        boolean z30;
        boolean z31;
        boolean z32;
        boolean z33;
        int i34;
        Object obj;
        int i35;
        d dVar;
        d dVar2;
        SparseArray sparseArray;
        d dVar3;
        int i36;
        int i37;
        float f8;
        int i38;
        int i39;
        int i40;
        d dVar4;
        int i41;
        d dVar5;
        int i42;
        d dVar6;
        int i43;
        float f9;
        int i44;
        int i45;
        int i46;
        int i47;
        float parseFloat;
        int i48;
        char c9;
        boolean z34;
        boolean z35;
        int i49;
        String str;
        int d2;
        String resourceName;
        int id;
        d dVar7;
        String str2;
        boolean z36 = true;
        int i50 = 0;
        if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            z8 = true;
        } else {
            z8 = false;
        }
        e eVar2 = this.f8518f;
        eVar2.f16388h0 = z8;
        int i51 = 4;
        if (this.k) {
            this.k = false;
            int childCount = getChildCount();
            int i52 = 0;
            while (true) {
                if (i52 < childCount) {
                    if (getChildAt(i52).isLayoutRequested()) {
                        z32 = true;
                        break;
                    }
                    i52++;
                } else {
                    z32 = false;
                    break;
                }
            }
            if (z32) {
                boolean isInEditMode = isInEditMode();
                int childCount2 = getChildCount();
                for (int i53 = 0; i53 < childCount2; i53++) {
                    d a3 = a(getChildAt(i53));
                    if (a3 != null) {
                        a3.s();
                    }
                }
                Object obj2 = null;
                SparseArray sparseArray2 = this.f8516d;
                i9 = 4194304;
                if (isInEditMode) {
                    for (int i54 = 0; i54 < childCount2; i54++) {
                        View childAt = getChildAt(i54);
                        try {
                            resourceName = getResources().getResourceName(childAt.getId());
                            Integer valueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                if (this.f8526p == null) {
                                    this.f8526p = new HashMap();
                                }
                                int indexOf = resourceName.indexOf("/");
                                if (indexOf != -1) {
                                    str2 = resourceName.substring(indexOf + 1);
                                } else {
                                    str2 = resourceName;
                                }
                                try {
                                    this.f8526p.put(str2, valueOf);
                                } catch (Resources.NotFoundException unused) {
                                }
                            }
                            int indexOf2 = resourceName.indexOf(47);
                            if (indexOf2 != -1) {
                                resourceName = resourceName.substring(indexOf2 + 1);
                            }
                            id = childAt.getId();
                        } catch (Resources.NotFoundException unused2) {
                        }
                        if (id != 0) {
                            View view = (View) sparseArray2.get(id);
                            if (view == null && (view = findViewById(id)) != null && view != this && view.getParent() == this) {
                                onViewAdded(view);
                            }
                            if (view != this) {
                                if (view == null) {
                                    dVar7 = null;
                                } else {
                                    dVar7 = ((A.e) view.getLayoutParams()).f56k0;
                                }
                                dVar7.f16354W = resourceName;
                            }
                        }
                        dVar7 = eVar2;
                        dVar7.f16354W = resourceName;
                    }
                }
                float f10 = 0.0f;
                if (this.f8525o != -1) {
                    for (int i55 = 0; i55 < childCount2; i55++) {
                        getChildAt(i55).getId();
                    }
                }
                p pVar = this.f8523m;
                if (pVar != null) {
                    pVar.a(this);
                }
                eVar2.f16384d0.clear();
                ArrayList arrayList2 = this.f8517e;
                int size2 = arrayList2.size();
                if (size2 > 0) {
                    int i56 = 0;
                    while (i56 < size2) {
                        c cVar = (c) arrayList2.get(i56);
                        HashMap hashMap = cVar.f12i;
                        boolean z37 = z36;
                        if (cVar.isInEditMode()) {
                            cVar.setIds(cVar.f11h);
                        }
                        y.i iVar = cVar.f10g;
                        if (iVar == null) {
                            z34 = z32;
                        } else {
                            iVar.f16455e0 = i50;
                            Arrays.fill(iVar.f16454d0, obj2);
                            int i57 = i50;
                            while (i57 < cVar.f8e) {
                                int i58 = cVar.f7d[i57];
                                View view2 = (View) this.f8516d.get(i58);
                                if (view2 == null && (d2 = cVar.d(this, (str = (String) hashMap.get(Integer.valueOf(i58))))) != 0) {
                                    cVar.f7d[i57] = d2;
                                    hashMap.put(Integer.valueOf(d2), str);
                                    view2 = (View) this.f8516d.get(d2);
                                }
                                if (view2 != null) {
                                    y.i iVar2 = cVar.f10g;
                                    d a4 = a(view2);
                                    iVar2.getClass();
                                    if (a4 != iVar2 && a4 != null) {
                                        int i59 = iVar2.f16455e0 + 1;
                                        z35 = z32;
                                        d[] dVarArr = iVar2.f16454d0;
                                        i49 = i57;
                                        if (i59 > dVarArr.length) {
                                            iVar2.f16454d0 = (d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
                                        }
                                        d[] dVarArr2 = iVar2.f16454d0;
                                        int i60 = iVar2.f16455e0;
                                        dVarArr2[i60] = a4;
                                        iVar2.f16455e0 = i60 + 1;
                                        i57 = i49 + 1;
                                        z32 = z35;
                                    }
                                }
                                z35 = z32;
                                i49 = i57;
                                i57 = i49 + 1;
                                z32 = z35;
                            }
                            z34 = z32;
                            cVar.f10g.B();
                        }
                        i56++;
                        z36 = z37;
                        z32 = z34;
                        i50 = 0;
                        obj2 = null;
                    }
                }
                z33 = z32;
                boolean z38 = z36;
                for (int i61 = 0; i61 < childCount2; i61++) {
                    getChildAt(i61);
                }
                SparseArray sparseArray3 = this.f8527q;
                sparseArray3.clear();
                sparseArray3.put(0, eVar2);
                sparseArray3.put(getId(), eVar2);
                for (int i62 = 0; i62 < childCount2; i62++) {
                    View childAt2 = getChildAt(i62);
                    sparseArray3.put(childAt2.getId(), a(childAt2));
                }
                int i63 = 0;
                while (i63 < childCount2) {
                    View childAt3 = getChildAt(i63);
                    d a9 = a(childAt3);
                    if (a9 == null) {
                        i35 = i63;
                        i38 = childCount2;
                        sparseArray = sparseArray2;
                    } else {
                        A.e eVar3 = (A.e) childAt3.getLayoutParams();
                        eVar2.f16384d0.add(a9);
                        d dVar8 = a9.f16341I;
                        if (dVar8 != null) {
                            ((e) dVar8).f16384d0.remove(a9);
                            obj = null;
                            a9.f16341I = null;
                        } else {
                            obj = null;
                        }
                        a9.f16341I = eVar2;
                        eVar3.a();
                        a9.f16353V = childAt3.getVisibility();
                        a9.f16352U = childAt3;
                        if (childAt3 instanceof c) {
                            ((c) childAt3).f(a9, eVar2.f16388h0);
                        }
                        if (eVar3.Y) {
                            y.h hVar = (y.h) a9;
                            int i64 = eVar3.f53h0;
                            int i65 = eVar3.f55i0;
                            float f11 = eVar3.j0;
                            if (f11 != -1.0f) {
                                if (f11 > -1.0f) {
                                    hVar.f16449d0 = f11;
                                    c9 = 65535;
                                    hVar.f16450e0 = -1;
                                    hVar.f16451f0 = -1;
                                    i35 = i63;
                                    i38 = childCount2;
                                    sparseArray = sparseArray2;
                                }
                                i35 = i63;
                                i38 = childCount2;
                                sparseArray = sparseArray2;
                            } else {
                                c9 = 65535;
                                if (i64 != -1) {
                                    if (i64 > -1) {
                                        hVar.f16449d0 = -1.0f;
                                        hVar.f16450e0 = i64;
                                        hVar.f16451f0 = -1;
                                    }
                                } else if (i65 != -1 && i65 > -1) {
                                    hVar.f16449d0 = -1.0f;
                                    hVar.f16450e0 = -1;
                                    hVar.f16451f0 = i65;
                                    i35 = i63;
                                    i38 = childCount2;
                                    sparseArray = sparseArray2;
                                }
                                i35 = i63;
                                i38 = childCount2;
                                sparseArray = sparseArray2;
                            }
                        } else {
                            int i66 = eVar3.f39a0;
                            int i67 = eVar3.f41b0;
                            int i68 = eVar3.f43c0;
                            int i69 = eVar3.f45d0;
                            int i70 = eVar3.f47e0;
                            int i71 = eVar3.f49f0;
                            float f12 = eVar3.f51g0;
                            i35 = i63;
                            int i72 = eVar3.f58m;
                            int i73 = 2;
                            if (i72 != -1) {
                                d dVar9 = (d) sparseArray3.get(i72);
                                if (dVar9 != null) {
                                    float f13 = eVar3.f60o;
                                    a9.o(7, 7, eVar3.f59n, 0, dVar9);
                                    dVar6 = a9;
                                    dVar6.f16379v = f13;
                                } else {
                                    dVar6 = a9;
                                }
                                i38 = childCount2;
                                sparseArray = sparseArray2;
                                i42 = 3;
                            } else {
                                if (i66 != -1) {
                                    d dVar10 = (d) sparseArray3.get(i66);
                                    if (dVar10 != null) {
                                        dVar = a9;
                                        dVar.o(2, 2, ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, i70, dVar10);
                                    } else {
                                        dVar = a9;
                                    }
                                } else {
                                    dVar = a9;
                                    if (i67 != -1 && (dVar2 = (d) sparseArray3.get(i67)) != null) {
                                        int i74 = i51;
                                        sparseArray = sparseArray2;
                                        dVar.o(2, i74, ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, i70, dVar2);
                                        i73 = 2;
                                        i51 = i74;
                                        dVar = dVar;
                                        if (i68 == -1) {
                                            d dVar11 = (d) sparseArray3.get(i68);
                                            if (dVar11 != null) {
                                                dVar.o(i51, i73, ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, i71, dVar11);
                                            }
                                        } else if (i69 != -1 && (dVar3 = (d) sparseArray3.get(i69)) != null) {
                                            dVar.o(i51, i51, ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, i71, dVar3);
                                        }
                                        i36 = eVar3.f52h;
                                        if (i36 == -1) {
                                            d dVar12 = (d) sparseArray3.get(i36);
                                            if (dVar12 != null) {
                                                i44 = 3;
                                                dVar.o(3, 3, ((ViewGroup.MarginLayoutParams) eVar3).topMargin, eVar3.f66u, dVar12);
                                            } else {
                                                i44 = 3;
                                            }
                                            f8 = f12;
                                            i38 = childCount2;
                                            i39 = i44;
                                            i40 = 5;
                                            i37 = -1;
                                        } else {
                                            int i75 = eVar3.f54i;
                                            if (i75 != -1 && (dVar4 = (d) sparseArray3.get(i75)) != null) {
                                                i38 = childCount2;
                                                i37 = -1;
                                                f8 = f12;
                                                d dVar13 = dVar;
                                                dVar13.o(3, 5, ((ViewGroup.MarginLayoutParams) eVar3).topMargin, eVar3.f66u, dVar4);
                                                i39 = 3;
                                                i40 = 5;
                                                dVar = dVar13;
                                                i41 = eVar3.j;
                                                if (i41 != i37) {
                                                    d dVar14 = (d) sparseArray3.get(i41);
                                                    if (dVar14 != null) {
                                                        dVar.o(i40, i39, ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin, eVar3.f68w, dVar14);
                                                    }
                                                } else {
                                                    int i76 = eVar3.k;
                                                    if (i76 != i37 && (dVar5 = (d) sparseArray3.get(i76)) != null) {
                                                        i42 = i39;
                                                        dVar6 = dVar;
                                                        dVar6.o(i40, i40, ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin, eVar3.f68w, dVar5);
                                                        i43 = eVar3.f57l;
                                                        if (i43 != -1) {
                                                            View view3 = (View) sparseArray.get(i43);
                                                            d dVar15 = (d) sparseArray3.get(eVar3.f57l);
                                                            if (dVar15 != null && view3 != null && (view3.getLayoutParams() instanceof A.e)) {
                                                                A.e eVar4 = (A.e) view3.getLayoutParams();
                                                                boolean z39 = z38;
                                                                eVar3.f36X = z39;
                                                                eVar4.f36X = z39;
                                                                dVar6.g(6).b(dVar15.g(6), 0, -1, z39);
                                                                dVar6.f16380w = z39;
                                                                eVar4.f56k0.f16380w = z39;
                                                                dVar6.g(i42).h();
                                                                dVar6.g(5).h();
                                                            }
                                                        }
                                                        if (f8 >= f10) {
                                                            dVar6.f16350S = f8;
                                                        }
                                                        f9 = eVar3.f14A;
                                                        if (f9 >= f10) {
                                                            dVar6.f16351T = f9;
                                                        }
                                                    }
                                                }
                                                i42 = i39;
                                                dVar6 = dVar;
                                                i43 = eVar3.f57l;
                                                if (i43 != -1) {
                                                }
                                                if (f8 >= f10) {
                                                }
                                                f9 = eVar3.f14A;
                                                if (f9 >= f10) {
                                                }
                                            } else {
                                                i37 = -1;
                                                f8 = f12;
                                                i38 = childCount2;
                                                i39 = 3;
                                                i40 = 5;
                                            }
                                        }
                                        i41 = eVar3.j;
                                        if (i41 != i37) {
                                        }
                                        i42 = i39;
                                        dVar6 = dVar;
                                        i43 = eVar3.f57l;
                                        if (i43 != -1) {
                                        }
                                        if (f8 >= f10) {
                                        }
                                        f9 = eVar3.f14A;
                                        if (f9 >= f10) {
                                        }
                                    }
                                }
                                sparseArray = sparseArray2;
                                if (i68 == -1) {
                                }
                                i36 = eVar3.f52h;
                                if (i36 == -1) {
                                }
                                i41 = eVar3.j;
                                if (i41 != i37) {
                                }
                                i42 = i39;
                                dVar6 = dVar;
                                i43 = eVar3.f57l;
                                if (i43 != -1) {
                                }
                                if (f8 >= f10) {
                                }
                                f9 = eVar3.f14A;
                                if (f9 >= f10) {
                                }
                            }
                            if (isInEditMode && ((i48 = eVar3.f28P) != -1 || eVar3.f29Q != -1)) {
                                int i77 = eVar3.f29Q;
                                dVar6.f16345N = i48;
                                dVar6.f16346O = i77;
                            }
                            if (!eVar3.f34V) {
                                if (((ViewGroup.MarginLayoutParams) eVar3).width == -1) {
                                    if (eVar3.f31S) {
                                        dVar6.w(3);
                                    } else {
                                        dVar6.w(4);
                                    }
                                    dVar6.g(2).f16330e = ((ViewGroup.MarginLayoutParams) eVar3).leftMargin;
                                    dVar6.g(4).f16330e = ((ViewGroup.MarginLayoutParams) eVar3).rightMargin;
                                } else {
                                    dVar6.w(3);
                                    dVar6.y(0);
                                }
                            } else {
                                dVar6.w(1);
                                dVar6.y(((ViewGroup.MarginLayoutParams) eVar3).width);
                                if (((ViewGroup.MarginLayoutParams) eVar3).width == -2) {
                                    dVar6.w(2);
                                }
                            }
                            if (!eVar3.f35W) {
                                i45 = -1;
                                if (((ViewGroup.MarginLayoutParams) eVar3).height == -1) {
                                    if (eVar3.f32T) {
                                        dVar6.x(3);
                                    } else {
                                        dVar6.x(4);
                                    }
                                    dVar6.g(i42).f16330e = ((ViewGroup.MarginLayoutParams) eVar3).topMargin;
                                    dVar6.g(5).f16330e = ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin;
                                } else {
                                    dVar6.x(3);
                                    dVar6.v(0);
                                }
                            } else {
                                i45 = -1;
                                dVar6.x(1);
                                dVar6.v(((ViewGroup.MarginLayoutParams) eVar3).height);
                                if (((ViewGroup.MarginLayoutParams) eVar3).height == -2) {
                                    dVar6.x(2);
                                }
                            }
                            String str3 = eVar3.f15B;
                            if (str3 != null && str3.length() != 0) {
                                int length = str3.length();
                                int indexOf3 = str3.indexOf(44);
                                if (indexOf3 > 0 && indexOf3 < length - 1) {
                                    String substring = str3.substring(0, indexOf3);
                                    if (substring.equalsIgnoreCase("W")) {
                                        i46 = 0;
                                    } else if (substring.equalsIgnoreCase("H")) {
                                        i46 = 1;
                                    } else {
                                        i46 = i45;
                                    }
                                    i47 = indexOf3 + 1;
                                } else {
                                    i46 = i45;
                                    i47 = 0;
                                }
                                int indexOf4 = str3.indexOf(58);
                                if (indexOf4 >= 0 && indexOf4 < length - 1) {
                                    String substring2 = str3.substring(i47, indexOf4);
                                    String substring3 = str3.substring(indexOf4 + 1);
                                    if (substring2.length() > 0 && substring3.length() > 0) {
                                        try {
                                            float parseFloat2 = Float.parseFloat(substring2);
                                            float parseFloat3 = Float.parseFloat(substring3);
                                            if (parseFloat2 > f10 && parseFloat3 > f10) {
                                                if (i46 == 1) {
                                                    parseFloat = Math.abs(parseFloat3 / parseFloat2);
                                                } else {
                                                    parseFloat = Math.abs(parseFloat2 / parseFloat3);
                                                }
                                            }
                                        } catch (NumberFormatException unused3) {
                                        }
                                    }
                                    parseFloat = f10;
                                } else {
                                    String substring4 = str3.substring(i47);
                                    if (substring4.length() > 0) {
                                        parseFloat = Float.parseFloat(substring4);
                                    }
                                    parseFloat = f10;
                                }
                                if (parseFloat > f10) {
                                    dVar6.f16343L = parseFloat;
                                    dVar6.f16344M = i46;
                                }
                            } else {
                                dVar6.f16343L = f10;
                            }
                            float f14 = eVar3.f17D;
                            float[] fArr = dVar6.f16356Z;
                            fArr[0] = f14;
                            fArr[1] = eVar3.f18E;
                            dVar6.f16355X = eVar3.f19F;
                            dVar6.Y = eVar3.f20G;
                            int i78 = eVar3.f21H;
                            int i79 = eVar3.f23J;
                            int i80 = eVar3.f24L;
                            float f15 = eVar3.f26N;
                            dVar6.j = i78;
                            dVar6.f16370m = i79;
                            if (i80 == Integer.MAX_VALUE) {
                                i80 = 0;
                            }
                            dVar6.f16371n = i80;
                            dVar6.f16372o = f15;
                            if (f15 > 0.0f && f15 < 1.0f && i78 == 0) {
                                dVar6.j = 2;
                            }
                            int i81 = eVar3.f22I;
                            int i82 = eVar3.K;
                            int i83 = eVar3.f25M;
                            float f16 = eVar3.f27O;
                            dVar6.k = i81;
                            dVar6.f16373p = i82;
                            if (i83 == Integer.MAX_VALUE) {
                                i83 = 0;
                            }
                            dVar6.f16374q = i83;
                            dVar6.f16375r = f16;
                            if (f16 > 0.0f && f16 < 1.0f && i81 == 0) {
                                dVar6.k = 2;
                            }
                        }
                    }
                    i63 = i35 + 1;
                    sparseArray2 = sparseArray;
                    childCount2 = i38;
                    i51 = 4;
                    f10 = 0.0f;
                    z38 = true;
                }
            } else {
                z33 = z32;
                i9 = 4194304;
            }
            if (z33) {
                ArrayList arrayList3 = (ArrayList) eVar2.f16385e0.f4987e;
                arrayList3.clear();
                int size3 = eVar2.f16384d0.size();
                for (int i84 = 0; i84 < size3; i84++) {
                    d dVar16 = (d) eVar2.f16384d0.get(i84);
                    int[] iArr = dVar16.f16362c0;
                    int i85 = iArr[0];
                    if (i85 == 3 || i85 == 4 || (i34 = iArr[1]) == 3 || i34 == 4) {
                        arrayList3.add(dVar16);
                    }
                }
                eVar2.f16386f0.f16584b = true;
            }
        } else {
            i9 = 4194304;
        }
        int i86 = this.f8522l;
        int mode = View.MeasureSpec.getMode(i4);
        int size4 = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size5 = View.MeasureSpec.getSize(i8);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i87 = max + max2;
        int paddingWidth = getPaddingWidth();
        f fVar5 = this.f8528r;
        fVar5.f73b = max;
        fVar5.f74c = max2;
        fVar5.f75d = paddingWidth;
        fVar5.f76e = i87;
        fVar5.f77f = i4;
        fVar5.f78g = i8;
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        if (max3 <= 0 && max4 <= 0) {
            max3 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & i9) != 0) {
            i10 = size4;
            if (1 == getLayoutDirection()) {
                max3 = max4;
            }
            int i88 = i10 - paddingWidth;
            int i89 = size5 - i87;
            int i90 = fVar5.f76e;
            int i91 = fVar5.f75d;
            int childCount3 = getChildCount();
            if (mode == Integer.MIN_VALUE) {
                if (mode != 0) {
                    if (mode != 1073741824) {
                        i11 = i90;
                        i13 = i91;
                        i14 = 1;
                        i15 = Integer.MIN_VALUE;
                        i12 = 0;
                        if (mode2 != i15) {
                            if (mode2 != 0) {
                                if (mode2 != 1073741824) {
                                    i17 = 1;
                                    i16 = 0;
                                } else {
                                    i16 = Math.min(this.j - i11, i89);
                                    i17 = 1;
                                }
                                l6 = eVar2.l();
                                int[] iArr2 = eVar2.f16378u;
                                c1848e = eVar2.f16386f0;
                                if (i12 != l6 && i16 == eVar2.i()) {
                                    c6 = 1;
                                } else {
                                    c1848e.f16585c = true;
                                    c6 = 1;
                                }
                                eVar2.f16345N = 0;
                                eVar2.f16346O = 0;
                                iArr2[0] = this.f8521i - i13;
                                iArr2[c6] = this.j - i11;
                                eVar2.f16348Q = 0;
                                eVar2.f16349R = 0;
                                eVar2.w(i14);
                                eVar2.y(i12);
                                eVar2.x(i17);
                                eVar2.v(i16);
                                i18 = this.f8519g - i13;
                                if (i18 >= 0) {
                                    eVar2.f16348Q = 0;
                                } else {
                                    eVar2.f16348Q = i18;
                                }
                                i19 = this.f8520h - i11;
                                if (i19 >= 0) {
                                    eVar2.f16349R = 0;
                                } else {
                                    eVar2.f16349R = i19;
                                }
                                eVar2.j0 = max3;
                                eVar2.f16390k0 = max;
                                R.g gVar = eVar2.f16385e0;
                                e eVar5 = (e) gVar.f4989g;
                                ArrayList arrayList4 = (ArrayList) gVar.f4987e;
                                f fVar6 = eVar2.f16387g0;
                                int size6 = eVar2.f16384d0.size();
                                int l8 = eVar2.l();
                                int i92 = eVar2.i();
                                if ((i86 & 128) != 128) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                if (z9) {
                                    fVar = fVar5;
                                    if ((i86 & 64) != 64) {
                                        z10 = false;
                                        if (z10) {
                                            int i93 = 0;
                                            while (i93 < size6) {
                                                boolean z40 = z10;
                                                d dVar17 = (d) eVar2.f16384d0.get(i93);
                                                i20 = size6;
                                                int[] iArr3 = dVar17.f16362c0;
                                                int i94 = i93;
                                                if (iArr3[0] == 3) {
                                                    z29 = true;
                                                } else {
                                                    z29 = false;
                                                }
                                                if (iArr3[1] == 3) {
                                                    z30 = true;
                                                } else {
                                                    z30 = false;
                                                }
                                                if (z29 && z30) {
                                                    if (dVar17.f16343L > 0.0f) {
                                                        z31 = true;
                                                        if ((!dVar17.q() && z31) || ((dVar17.r() && z31) || (dVar17 instanceof y.g) || dVar17.q() || dVar17.r())) {
                                                            i21 = 1073741824;
                                                            z11 = false;
                                                            break;
                                                        } else {
                                                            i93 = i94 + 1;
                                                            z10 = z40;
                                                            size6 = i20;
                                                        }
                                                    }
                                                }
                                                z31 = false;
                                                if (!dVar17.q()) {
                                                }
                                                i93 = i94 + 1;
                                                z10 = z40;
                                                size6 = i20;
                                            }
                                        }
                                        z11 = z10;
                                        i20 = size6;
                                        i21 = 1073741824;
                                        if ((mode != i21 && mode2 == i21) || z9) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        if (z11 & z12) {
                                            int min = Math.min(iArr2[0], i88);
                                            int min2 = Math.min(iArr2[1], i89);
                                            if (mode == 1073741824 && eVar2.l() != min) {
                                                eVar2.y(min);
                                                eVar2.f16386f0.f16584b = true;
                                            }
                                            if (mode2 == 1073741824 && eVar2.i() != min2) {
                                                eVar2.v(min2);
                                                eVar2.f16386f0.f16584b = true;
                                            }
                                            if (mode == 1073741824 && mode2 == 1073741824) {
                                                ArrayList arrayList5 = c1848e.f16587e;
                                                e eVar6 = c1848e.f16583a;
                                                if (!c1848e.f16584b && !c1848e.f16585c) {
                                                    i30 = 0;
                                                } else {
                                                    Iterator it3 = eVar6.f16384d0.iterator();
                                                    while (it3.hasNext()) {
                                                        d dVar18 = (d) it3.next();
                                                        dVar18.f16357a = false;
                                                        dVar18.f16363d.n();
                                                        dVar18.f16364e.m();
                                                    }
                                                    i30 = 0;
                                                    eVar6.f16357a = false;
                                                    eVar6.f16363d.n();
                                                    eVar6.f16364e.m();
                                                    c1848e.f16585c = false;
                                                }
                                                c1848e.b(c1848e.f16586d);
                                                eVar6.f16345N = i30;
                                                int[] iArr4 = eVar6.f16362c0;
                                                l lVar = eVar6.f16364e;
                                                j jVar = eVar6.f16363d;
                                                eVar6.f16346O = i30;
                                                int h8 = eVar6.h(i30);
                                                fVar2 = fVar6;
                                                int h9 = eVar6.h(1);
                                                if (c1848e.f16584b) {
                                                    c1848e.c();
                                                }
                                                int m6 = eVar6.m();
                                                arrayList = arrayList4;
                                                int n3 = eVar6.n();
                                                eVar = eVar5;
                                                C1849f c1849f = jVar.f16612h;
                                                i22 = l8;
                                                C1850g c1850g = jVar.f16609e;
                                                c1849f.d(m6);
                                                C1849f c1849f2 = lVar.f16612h;
                                                C1850g c1850g2 = lVar.f16609e;
                                                c1849f2.d(n3);
                                                c1848e.g();
                                                if (h8 == 2 || h9 == 2) {
                                                    if (z9) {
                                                        Iterator it4 = arrayList5.iterator();
                                                        while (true) {
                                                            if (it4.hasNext()) {
                                                                if (!((m) it4.next()).k()) {
                                                                    z9 = false;
                                                                    break;
                                                                }
                                                            } else {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    if (z9 && h8 == 2) {
                                                        eVar6.w(1);
                                                        z27 = z9;
                                                        eVar6.y(c1848e.d(eVar6, 0));
                                                        c1850g.d(eVar6.l());
                                                    } else {
                                                        z27 = z9;
                                                    }
                                                    if (z27 && h9 == 2) {
                                                        i31 = 1;
                                                        eVar6.x(1);
                                                        eVar6.v(c1848e.d(eVar6, 1));
                                                        c1850g2.d(eVar6.i());
                                                        i32 = iArr4[0];
                                                        if (i32 == i31 && i32 != 4) {
                                                            z28 = false;
                                                        } else {
                                                            int l9 = eVar6.l() + m6;
                                                            jVar.f16613i.d(l9);
                                                            c1850g.d(l9 - m6);
                                                            c1848e.g();
                                                            i33 = iArr4[1];
                                                            if (i33 != 1 || i33 == 4) {
                                                                int i95 = eVar6.i() + n3;
                                                                lVar.f16613i.d(i95);
                                                                c1850g2.d(i95 - n3);
                                                            }
                                                            c1848e.g();
                                                            z28 = true;
                                                        }
                                                        it = arrayList5.iterator();
                                                        while (it.hasNext()) {
                                                            m mVar = (m) it.next();
                                                            if (mVar.f16606b != eVar6 || mVar.f16611g) {
                                                                mVar.e();
                                                            }
                                                        }
                                                        it2 = arrayList5.iterator();
                                                        while (it2.hasNext()) {
                                                            m mVar2 = (m) it2.next();
                                                            if (z28 || mVar2.f16606b != eVar6) {
                                                                if (!mVar2.f16612h.j || ((!mVar2.f16613i.j && !(mVar2 instanceof z.h)) || (!mVar2.f16609e.j && !(mVar2 instanceof C1846c) && !(mVar2 instanceof z.h)))) {
                                                                    z13 = false;
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        z13 = true;
                                                        eVar6.w(h8);
                                                        eVar6.x(h9);
                                                        i23 = 2;
                                                        i29 = 1073741824;
                                                    }
                                                }
                                                i31 = 1;
                                                i32 = iArr4[0];
                                                if (i32 == i31) {
                                                }
                                                int l92 = eVar6.l() + m6;
                                                jVar.f16613i.d(l92);
                                                c1850g.d(l92 - m6);
                                                c1848e.g();
                                                i33 = iArr4[1];
                                                if (i33 != 1) {
                                                }
                                                int i952 = eVar6.i() + n3;
                                                lVar.f16613i.d(i952);
                                                c1850g2.d(i952 - n3);
                                                c1848e.g();
                                                z28 = true;
                                                it = arrayList5.iterator();
                                                while (it.hasNext()) {
                                                }
                                                it2 = arrayList5.iterator();
                                                while (it2.hasNext()) {
                                                }
                                                z13 = true;
                                                eVar6.w(h8);
                                                eVar6.x(h9);
                                                i23 = 2;
                                                i29 = 1073741824;
                                            } else {
                                                eVar = eVar5;
                                                arrayList = arrayList4;
                                                fVar2 = fVar6;
                                                i22 = l8;
                                                e eVar7 = c1848e.f16583a;
                                                if (c1848e.f16584b) {
                                                    Iterator it5 = eVar7.f16384d0.iterator();
                                                    while (it5.hasNext()) {
                                                        d dVar19 = (d) it5.next();
                                                        dVar19.f16357a = false;
                                                        j jVar2 = dVar19.f16363d;
                                                        jVar2.f16609e.j = false;
                                                        jVar2.f16611g = false;
                                                        jVar2.n();
                                                        l lVar2 = dVar19.f16364e;
                                                        lVar2.f16609e.j = false;
                                                        lVar2.f16611g = false;
                                                        lVar2.m();
                                                    }
                                                    i28 = 0;
                                                    eVar7.f16357a = false;
                                                    j jVar3 = eVar7.f16363d;
                                                    jVar3.f16609e.j = false;
                                                    jVar3.f16611g = false;
                                                    jVar3.n();
                                                    l lVar3 = eVar7.f16364e;
                                                    lVar3.f16609e.j = false;
                                                    lVar3.f16611g = false;
                                                    lVar3.m();
                                                    c1848e.c();
                                                } else {
                                                    i28 = 0;
                                                }
                                                c1848e.b(c1848e.f16586d);
                                                eVar7.f16345N = i28;
                                                eVar7.f16346O = i28;
                                                eVar7.f16363d.f16612h.d(i28);
                                                eVar7.f16364e.f16612h.d(i28);
                                                i29 = 1073741824;
                                                if (mode == 1073741824) {
                                                    z24 = eVar2.D(i28, z9);
                                                    i23 = 1;
                                                } else {
                                                    z24 = true;
                                                    i23 = 0;
                                                }
                                                if (mode2 == 1073741824) {
                                                    z13 = eVar2.D(1, z9) & z24;
                                                    i23++;
                                                } else {
                                                    z13 = z24;
                                                }
                                            }
                                            if (z13) {
                                                if (mode == i29) {
                                                    z25 = true;
                                                } else {
                                                    z25 = false;
                                                }
                                                if (mode2 == i29) {
                                                    z26 = true;
                                                } else {
                                                    z26 = false;
                                                }
                                                eVar2.z(z25, z26);
                                            }
                                        } else {
                                            eVar = eVar5;
                                            arrayList = arrayList4;
                                            fVar2 = fVar6;
                                            i22 = l8;
                                            z13 = false;
                                            i23 = 0;
                                        }
                                        if (z13 || i23 != 2) {
                                            if (i20 > 0) {
                                                int size7 = eVar2.f16384d0.size();
                                                f fVar7 = eVar2.f16387g0;
                                                for (int i96 = 0; i96 < size7; i96++) {
                                                    d dVar20 = (d) eVar2.f16384d0.get(i96);
                                                    if (!(dVar20 instanceof y.h) && (!dVar20.f16363d.f16609e.j || !dVar20.f16364e.f16609e.j)) {
                                                        int h10 = dVar20.h(0);
                                                        int h11 = dVar20.h(1);
                                                        if (h10 != 3 || dVar20.j == 1 || h11 != 3 || dVar20.k == 1) {
                                                            gVar.I(fVar7, dVar20, false);
                                                        }
                                                    }
                                                }
                                                ConstraintLayout constraintLayout = fVar7.f72a;
                                                int childCount4 = constraintLayout.getChildCount();
                                                ArrayList arrayList6 = constraintLayout.f8517e;
                                                for (int i97 = 0; i97 < childCount4; i97++) {
                                                    constraintLayout.getChildAt(i97);
                                                }
                                                int size8 = arrayList6.size();
                                                if (size8 > 0) {
                                                    for (int i98 = 0; i98 < size8; i98++) {
                                                        ((c) arrayList6.get(i98)).getClass();
                                                    }
                                                }
                                            }
                                            i24 = eVar2.f16395p0;
                                            size = arrayList.size();
                                            int i99 = i22;
                                            if (i20 > 0) {
                                                gVar.O(eVar2, i99, i92);
                                            }
                                            if (size > 0) {
                                                int[] iArr5 = eVar2.f16362c0;
                                                if (iArr5[0] == 2) {
                                                    z15 = true;
                                                } else {
                                                    z15 = false;
                                                }
                                                if (iArr5[1] == 2) {
                                                    z16 = true;
                                                } else {
                                                    z16 = false;
                                                }
                                                e eVar8 = eVar;
                                                int max5 = Math.max(eVar2.l(), eVar8.f16348Q);
                                                int max6 = Math.max(eVar2.i(), eVar8.f16349R);
                                                int i100 = max5;
                                                int i101 = max6;
                                                int i102 = 0;
                                                boolean z41 = false;
                                                while (i102 < size) {
                                                    ArrayList arrayList7 = arrayList;
                                                    d dVar21 = (d) arrayList7.get(i102);
                                                    if (!(dVar21 instanceof y.g)) {
                                                        z20 = z16;
                                                        z21 = z15;
                                                        fVar4 = fVar2;
                                                    } else {
                                                        int l10 = dVar21.l();
                                                        int i103 = dVar21.i();
                                                        z20 = z16;
                                                        z21 = z15;
                                                        fVar4 = fVar2;
                                                        boolean I8 = z41 | gVar.I(fVar4, dVar21, true);
                                                        int l11 = dVar21.l();
                                                        boolean z42 = I8;
                                                        int i104 = dVar21.i();
                                                        if (l11 != l10) {
                                                            dVar21.y(l11);
                                                            if (z21 && dVar21.m() + dVar21.f16342J > i100) {
                                                                i100 = Math.max(i100, dVar21.g(4).c() + dVar21.m() + dVar21.f16342J);
                                                            }
                                                            z42 = true;
                                                        }
                                                        if (i104 != i103) {
                                                            dVar21.v(i104);
                                                            if (z20 && dVar21.n() + dVar21.K > i101) {
                                                                i101 = Math.max(i101, dVar21.g(5).c() + dVar21.n() + dVar21.K);
                                                            }
                                                            z42 = true;
                                                        }
                                                        z41 = z42 | ((y.g) dVar21).f16434l0;
                                                    }
                                                    i102++;
                                                    fVar2 = fVar4;
                                                    arrayList = arrayList7;
                                                    z16 = z20;
                                                    z15 = z21;
                                                }
                                                boolean z43 = z16;
                                                boolean z44 = z15;
                                                ArrayList arrayList8 = arrayList;
                                                int i105 = 0;
                                                while (true) {
                                                    f fVar8 = fVar2;
                                                    if (i105 >= 2) {
                                                        break;
                                                    }
                                                    int i106 = i101;
                                                    int i107 = i100;
                                                    boolean z45 = z41;
                                                    int i108 = 0;
                                                    while (i108 < size) {
                                                        d dVar22 = (d) arrayList8.get(i108);
                                                        if (((dVar22 instanceof y.i) && !(dVar22 instanceof y.g)) || (dVar22 instanceof y.h) || dVar22.f16353V == 8 || ((dVar22.f16363d.f16609e.j && dVar22.f16364e.f16609e.j) || (dVar22 instanceof y.g))) {
                                                            i25 = size;
                                                            fVar3 = fVar8;
                                                            i26 = i105;
                                                        } else {
                                                            int l12 = dVar22.l();
                                                            int i109 = dVar22.i();
                                                            i25 = size;
                                                            int i110 = dVar22.f16347P;
                                                            i26 = i105;
                                                            boolean I9 = z45 | gVar.I(fVar8, dVar22, true);
                                                            int l13 = dVar22.l();
                                                            fVar3 = fVar8;
                                                            int i111 = dVar22.i();
                                                            if (l13 != l12) {
                                                                dVar22.y(l13);
                                                                if (z44 && dVar22.m() + dVar22.f16342J > i107) {
                                                                    i107 = Math.max(i107, dVar22.g(4).c() + dVar22.m() + dVar22.f16342J);
                                                                }
                                                                I9 = true;
                                                            }
                                                            if (i111 != i109) {
                                                                dVar22.v(i111);
                                                                if (z43 && dVar22.n() + dVar22.K > i106) {
                                                                    i106 = Math.max(i106, dVar22.g(5).c() + dVar22.n() + dVar22.K);
                                                                }
                                                                i27 = i106;
                                                                z19 = true;
                                                            } else {
                                                                i27 = i106;
                                                                z19 = I9;
                                                            }
                                                            if (dVar22.f16380w && i110 != dVar22.f16347P) {
                                                                i106 = i27;
                                                                z45 = true;
                                                            } else {
                                                                z45 = z19;
                                                                i106 = i27;
                                                            }
                                                        }
                                                        i108++;
                                                        size = i25;
                                                        i105 = i26;
                                                        fVar8 = fVar3;
                                                    }
                                                    int i112 = size;
                                                    fVar2 = fVar8;
                                                    int i113 = i105;
                                                    if (z45) {
                                                        gVar.O(eVar2, i99, i92);
                                                        z41 = false;
                                                    } else {
                                                        z41 = z45;
                                                    }
                                                    i105 = i113 + 1;
                                                    i100 = i107;
                                                    i101 = i106;
                                                    size = i112;
                                                }
                                                if (z41) {
                                                    gVar.O(eVar2, i99, i92);
                                                    if (eVar2.l() < i100) {
                                                        eVar2.y(i100);
                                                        z17 = true;
                                                    } else {
                                                        z17 = false;
                                                    }
                                                    if (eVar2.i() < i101) {
                                                        eVar2.v(i101);
                                                        z18 = true;
                                                    } else {
                                                        z18 = z17;
                                                    }
                                                    if (z18) {
                                                        gVar.O(eVar2, i99, i92);
                                                    }
                                                }
                                            }
                                            eVar2.f16395p0 = i24;
                                            if ((i24 & 256) == 256) {
                                                z14 = true;
                                            } else {
                                                z14 = false;
                                            }
                                            C1766e.f16040p = z14;
                                        }
                                        int l14 = eVar2.l();
                                        int i114 = eVar2.i();
                                        z22 = eVar2.f16396q0;
                                        z23 = eVar2.f16397r0;
                                        f fVar9 = fVar;
                                        int i115 = fVar9.f76e;
                                        int resolveSizeAndState = View.resolveSizeAndState(l14 + fVar9.f75d, i4, 0);
                                        int resolveSizeAndState2 = View.resolveSizeAndState(i114 + i115, i8, 0) & 16777215;
                                        int min3 = Math.min(this.f8521i, resolveSizeAndState & 16777215);
                                        int min4 = Math.min(this.j, resolveSizeAndState2);
                                        if (z22) {
                                            min3 |= 16777216;
                                        }
                                        if (z23) {
                                            min4 |= 16777216;
                                        }
                                        setMeasuredDimension(min3, min4);
                                    }
                                } else {
                                    fVar = fVar5;
                                }
                                z10 = true;
                                if (z10) {
                                }
                                z11 = z10;
                                i20 = size6;
                                i21 = 1073741824;
                                if (mode != i21) {
                                }
                                z12 = false;
                                if (z11 & z12) {
                                }
                                if (z13) {
                                }
                                if (i20 > 0) {
                                }
                                i24 = eVar2.f16395p0;
                                size = arrayList.size();
                                int i992 = i22;
                                if (i20 > 0) {
                                }
                                if (size > 0) {
                                }
                                eVar2.f16395p0 = i24;
                                if ((i24 & 256) == 256) {
                                }
                                C1766e.f16040p = z14;
                                int l142 = eVar2.l();
                                int i1142 = eVar2.i();
                                z22 = eVar2.f16396q0;
                                z23 = eVar2.f16397r0;
                                f fVar92 = fVar;
                                int i1152 = fVar92.f76e;
                                int resolveSizeAndState3 = View.resolveSizeAndState(l142 + fVar92.f75d, i4, 0);
                                int resolveSizeAndState22 = View.resolveSizeAndState(i1142 + i1152, i8, 0) & 16777215;
                                int min32 = Math.min(this.f8521i, resolveSizeAndState3 & 16777215);
                                int min42 = Math.min(this.j, resolveSizeAndState22);
                                if (z22) {
                                }
                                if (z23) {
                                }
                                setMeasuredDimension(min32, min42);
                            }
                            if (childCount3 == 0) {
                                i16 = Math.max(0, this.f8520h);
                            } else {
                                i16 = 0;
                            }
                        } else if (childCount3 == 0) {
                            i16 = Math.max(0, this.f8520h);
                        } else {
                            i16 = i89;
                        }
                        i17 = 2;
                        l6 = eVar2.l();
                        int[] iArr22 = eVar2.f16378u;
                        c1848e = eVar2.f16386f0;
                        if (i12 != l6) {
                        }
                        c1848e.f16585c = true;
                        c6 = 1;
                        eVar2.f16345N = 0;
                        eVar2.f16346O = 0;
                        iArr22[0] = this.f8521i - i13;
                        iArr22[c6] = this.j - i11;
                        eVar2.f16348Q = 0;
                        eVar2.f16349R = 0;
                        eVar2.w(i14);
                        eVar2.y(i12);
                        eVar2.x(i17);
                        eVar2.v(i16);
                        i18 = this.f8519g - i13;
                        if (i18 >= 0) {
                        }
                        i19 = this.f8520h - i11;
                        if (i19 >= 0) {
                        }
                        eVar2.j0 = max3;
                        eVar2.f16390k0 = max;
                        R.g gVar2 = eVar2.f16385e0;
                        e eVar52 = (e) gVar2.f4989g;
                        ArrayList arrayList42 = (ArrayList) gVar2.f4987e;
                        f fVar62 = eVar2.f16387g0;
                        int size62 = eVar2.f16384d0.size();
                        int l82 = eVar2.l();
                        int i922 = eVar2.i();
                        if ((i86 & 128) != 128) {
                        }
                        if (z9) {
                        }
                        z10 = true;
                        if (z10) {
                        }
                        z11 = z10;
                        i20 = size62;
                        i21 = 1073741824;
                        if (mode != i21) {
                        }
                        z12 = false;
                        if (z11 & z12) {
                        }
                        if (z13) {
                        }
                        if (i20 > 0) {
                        }
                        i24 = eVar2.f16395p0;
                        size = arrayList.size();
                        int i9922 = i22;
                        if (i20 > 0) {
                        }
                        if (size > 0) {
                        }
                        eVar2.f16395p0 = i24;
                        if ((i24 & 256) == 256) {
                        }
                        C1766e.f16040p = z14;
                        int l1422 = eVar2.l();
                        int i11422 = eVar2.i();
                        z22 = eVar2.f16396q0;
                        z23 = eVar2.f16397r0;
                        f fVar922 = fVar;
                        int i11522 = fVar922.f76e;
                        int resolveSizeAndState32 = View.resolveSizeAndState(l1422 + fVar922.f75d, i4, 0);
                        int resolveSizeAndState222 = View.resolveSizeAndState(i11422 + i11522, i8, 0) & 16777215;
                        int min322 = Math.min(this.f8521i, resolveSizeAndState32 & 16777215);
                        int min422 = Math.min(this.j, resolveSizeAndState222);
                        if (z22) {
                        }
                        if (z23) {
                        }
                        setMeasuredDimension(min322, min422);
                    }
                    i12 = Math.min(this.f8521i - i91, i88);
                    i11 = i90;
                    i13 = i91;
                    i14 = 1;
                    i15 = Integer.MIN_VALUE;
                    if (mode2 != i15) {
                    }
                    i17 = 2;
                    l6 = eVar2.l();
                    int[] iArr222 = eVar2.f16378u;
                    c1848e = eVar2.f16386f0;
                    if (i12 != l6) {
                    }
                    c1848e.f16585c = true;
                    c6 = 1;
                    eVar2.f16345N = 0;
                    eVar2.f16346O = 0;
                    iArr222[0] = this.f8521i - i13;
                    iArr222[c6] = this.j - i11;
                    eVar2.f16348Q = 0;
                    eVar2.f16349R = 0;
                    eVar2.w(i14);
                    eVar2.y(i12);
                    eVar2.x(i17);
                    eVar2.v(i16);
                    i18 = this.f8519g - i13;
                    if (i18 >= 0) {
                    }
                    i19 = this.f8520h - i11;
                    if (i19 >= 0) {
                    }
                    eVar2.j0 = max3;
                    eVar2.f16390k0 = max;
                    R.g gVar22 = eVar2.f16385e0;
                    e eVar522 = (e) gVar22.f4989g;
                    ArrayList arrayList422 = (ArrayList) gVar22.f4987e;
                    f fVar622 = eVar2.f16387g0;
                    int size622 = eVar2.f16384d0.size();
                    int l822 = eVar2.l();
                    int i9222 = eVar2.i();
                    if ((i86 & 128) != 128) {
                    }
                    if (z9) {
                    }
                    z10 = true;
                    if (z10) {
                    }
                    z11 = z10;
                    i20 = size622;
                    i21 = 1073741824;
                    if (mode != i21) {
                    }
                    z12 = false;
                    if (z11 & z12) {
                    }
                    if (z13) {
                    }
                    if (i20 > 0) {
                    }
                    i24 = eVar2.f16395p0;
                    size = arrayList.size();
                    int i99222 = i22;
                    if (i20 > 0) {
                    }
                    if (size > 0) {
                    }
                    eVar2.f16395p0 = i24;
                    if ((i24 & 256) == 256) {
                    }
                    C1766e.f16040p = z14;
                    int l14222 = eVar2.l();
                    int i114222 = eVar2.i();
                    z22 = eVar2.f16396q0;
                    z23 = eVar2.f16397r0;
                    f fVar9222 = fVar;
                    int i115222 = fVar9222.f76e;
                    int resolveSizeAndState322 = View.resolveSizeAndState(l14222 + fVar9222.f75d, i4, 0);
                    int resolveSizeAndState2222 = View.resolveSizeAndState(i114222 + i115222, i8, 0) & 16777215;
                    int min3222 = Math.min(this.f8521i, resolveSizeAndState322 & 16777215);
                    int min4222 = Math.min(this.j, resolveSizeAndState2222);
                    if (z22) {
                    }
                    if (z23) {
                    }
                    setMeasuredDimension(min3222, min4222);
                }
                if (childCount3 == 0) {
                    i11 = i90;
                    i13 = i91;
                    i12 = Math.max(0, this.f8519g);
                    i14 = 2;
                    i15 = Integer.MIN_VALUE;
                    if (mode2 != i15) {
                    }
                    i17 = 2;
                    l6 = eVar2.l();
                    int[] iArr2222 = eVar2.f16378u;
                    c1848e = eVar2.f16386f0;
                    if (i12 != l6) {
                    }
                    c1848e.f16585c = true;
                    c6 = 1;
                    eVar2.f16345N = 0;
                    eVar2.f16346O = 0;
                    iArr2222[0] = this.f8521i - i13;
                    iArr2222[c6] = this.j - i11;
                    eVar2.f16348Q = 0;
                    eVar2.f16349R = 0;
                    eVar2.w(i14);
                    eVar2.y(i12);
                    eVar2.x(i17);
                    eVar2.v(i16);
                    i18 = this.f8519g - i13;
                    if (i18 >= 0) {
                    }
                    i19 = this.f8520h - i11;
                    if (i19 >= 0) {
                    }
                    eVar2.j0 = max3;
                    eVar2.f16390k0 = max;
                    R.g gVar222 = eVar2.f16385e0;
                    e eVar5222 = (e) gVar222.f4989g;
                    ArrayList arrayList4222 = (ArrayList) gVar222.f4987e;
                    f fVar6222 = eVar2.f16387g0;
                    int size6222 = eVar2.f16384d0.size();
                    int l8222 = eVar2.l();
                    int i92222 = eVar2.i();
                    if ((i86 & 128) != 128) {
                    }
                    if (z9) {
                    }
                    z10 = true;
                    if (z10) {
                    }
                    z11 = z10;
                    i20 = size6222;
                    i21 = 1073741824;
                    if (mode != i21) {
                    }
                    z12 = false;
                    if (z11 & z12) {
                    }
                    if (z13) {
                    }
                    if (i20 > 0) {
                    }
                    i24 = eVar2.f16395p0;
                    size = arrayList.size();
                    int i992222 = i22;
                    if (i20 > 0) {
                    }
                    if (size > 0) {
                    }
                    eVar2.f16395p0 = i24;
                    if ((i24 & 256) == 256) {
                    }
                    C1766e.f16040p = z14;
                    int l142222 = eVar2.l();
                    int i1142222 = eVar2.i();
                    z22 = eVar2.f16396q0;
                    z23 = eVar2.f16397r0;
                    f fVar92222 = fVar;
                    int i1152222 = fVar92222.f76e;
                    int resolveSizeAndState3222 = View.resolveSizeAndState(l142222 + fVar92222.f75d, i4, 0);
                    int resolveSizeAndState22222 = View.resolveSizeAndState(i1142222 + i1152222, i8, 0) & 16777215;
                    int min32222 = Math.min(this.f8521i, resolveSizeAndState3222 & 16777215);
                    int min42222 = Math.min(this.j, resolveSizeAndState22222);
                    if (z22) {
                    }
                    if (z23) {
                    }
                    setMeasuredDimension(min32222, min42222);
                }
                i11 = i90;
                i12 = 0;
            } else {
                i11 = i90;
                if (childCount3 == 0) {
                    i12 = Math.max(0, this.f8519g);
                } else {
                    i12 = i88;
                }
            }
            i13 = i91;
            i14 = 2;
            i15 = Integer.MIN_VALUE;
            if (mode2 != i15) {
            }
            i17 = 2;
            l6 = eVar2.l();
            int[] iArr22222 = eVar2.f16378u;
            c1848e = eVar2.f16386f0;
            if (i12 != l6) {
            }
            c1848e.f16585c = true;
            c6 = 1;
            eVar2.f16345N = 0;
            eVar2.f16346O = 0;
            iArr22222[0] = this.f8521i - i13;
            iArr22222[c6] = this.j - i11;
            eVar2.f16348Q = 0;
            eVar2.f16349R = 0;
            eVar2.w(i14);
            eVar2.y(i12);
            eVar2.x(i17);
            eVar2.v(i16);
            i18 = this.f8519g - i13;
            if (i18 >= 0) {
            }
            i19 = this.f8520h - i11;
            if (i19 >= 0) {
            }
            eVar2.j0 = max3;
            eVar2.f16390k0 = max;
            R.g gVar2222 = eVar2.f16385e0;
            e eVar52222 = (e) gVar2222.f4989g;
            ArrayList arrayList42222 = (ArrayList) gVar2222.f4987e;
            f fVar62222 = eVar2.f16387g0;
            int size62222 = eVar2.f16384d0.size();
            int l82222 = eVar2.l();
            int i922222 = eVar2.i();
            if ((i86 & 128) != 128) {
            }
            if (z9) {
            }
            z10 = true;
            if (z10) {
            }
            z11 = z10;
            i20 = size62222;
            i21 = 1073741824;
            if (mode != i21) {
            }
            z12 = false;
            if (z11 & z12) {
            }
            if (z13) {
            }
            if (i20 > 0) {
            }
            i24 = eVar2.f16395p0;
            size = arrayList.size();
            int i9922222 = i22;
            if (i20 > 0) {
            }
            if (size > 0) {
            }
            eVar2.f16395p0 = i24;
            if ((i24 & 256) == 256) {
            }
            C1766e.f16040p = z14;
            int l1422222 = eVar2.l();
            int i11422222 = eVar2.i();
            z22 = eVar2.f16396q0;
            z23 = eVar2.f16397r0;
            f fVar922222 = fVar;
            int i11522222 = fVar922222.f76e;
            int resolveSizeAndState32222 = View.resolveSizeAndState(l1422222 + fVar922222.f75d, i4, 0);
            int resolveSizeAndState222222 = View.resolveSizeAndState(i11422222 + i11522222, i8, 0) & 16777215;
            int min322222 = Math.min(this.f8521i, resolveSizeAndState32222 & 16777215);
            int min422222 = Math.min(this.j, resolveSizeAndState222222);
            if (z22) {
            }
            if (z23) {
            }
            setMeasuredDimension(min322222, min422222);
        }
        i10 = size4;
        int i882 = i10 - paddingWidth;
        int i892 = size5 - i87;
        int i902 = fVar5.f76e;
        int i912 = fVar5.f75d;
        int childCount32 = getChildCount();
        if (mode == Integer.MIN_VALUE) {
        }
        i13 = i912;
        i14 = 2;
        i15 = Integer.MIN_VALUE;
        if (mode2 != i15) {
        }
        i17 = 2;
        l6 = eVar2.l();
        int[] iArr222222 = eVar2.f16378u;
        c1848e = eVar2.f16386f0;
        if (i12 != l6) {
        }
        c1848e.f16585c = true;
        c6 = 1;
        eVar2.f16345N = 0;
        eVar2.f16346O = 0;
        iArr222222[0] = this.f8521i - i13;
        iArr222222[c6] = this.j - i11;
        eVar2.f16348Q = 0;
        eVar2.f16349R = 0;
        eVar2.w(i14);
        eVar2.y(i12);
        eVar2.x(i17);
        eVar2.v(i16);
        i18 = this.f8519g - i13;
        if (i18 >= 0) {
        }
        i19 = this.f8520h - i11;
        if (i19 >= 0) {
        }
        eVar2.j0 = max3;
        eVar2.f16390k0 = max;
        R.g gVar22222 = eVar2.f16385e0;
        e eVar522222 = (e) gVar22222.f4989g;
        ArrayList arrayList422222 = (ArrayList) gVar22222.f4987e;
        f fVar622222 = eVar2.f16387g0;
        int size622222 = eVar2.f16384d0.size();
        int l822222 = eVar2.l();
        int i9222222 = eVar2.i();
        if ((i86 & 128) != 128) {
        }
        if (z9) {
        }
        z10 = true;
        if (z10) {
        }
        z11 = z10;
        i20 = size622222;
        i21 = 1073741824;
        if (mode != i21) {
        }
        z12 = false;
        if (z11 & z12) {
        }
        if (z13) {
        }
        if (i20 > 0) {
        }
        i24 = eVar2.f16395p0;
        size = arrayList.size();
        int i99222222 = i22;
        if (i20 > 0) {
        }
        if (size > 0) {
        }
        eVar2.f16395p0 = i24;
        if ((i24 & 256) == 256) {
        }
        C1766e.f16040p = z14;
        int l14222222 = eVar2.l();
        int i114222222 = eVar2.i();
        z22 = eVar2.f16396q0;
        z23 = eVar2.f16397r0;
        f fVar9222222 = fVar;
        int i115222222 = fVar9222222.f76e;
        int resolveSizeAndState322222 = View.resolveSizeAndState(l14222222 + fVar9222222.f75d, i4, 0);
        int resolveSizeAndState2222222 = View.resolveSizeAndState(i114222222 + i115222222, i8, 0) & 16777215;
        int min3222222 = Math.min(this.f8521i, resolveSizeAndState322222 & 16777215);
        int min4222222 = Math.min(this.j, resolveSizeAndState2222222);
        if (z22) {
        }
        if (z23) {
        }
        setMeasuredDimension(min3222222, min4222222);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        d a3 = a(view);
        if ((view instanceof Guideline) && !(a3 instanceof y.h)) {
            A.e eVar = (A.e) view.getLayoutParams();
            y.h hVar = new y.h();
            eVar.f56k0 = hVar;
            eVar.Y = true;
            hVar.B(eVar.f30R);
        }
        if (view instanceof c) {
            c cVar = (c) view;
            cVar.g();
            ((A.e) view.getLayoutParams()).f37Z = true;
            ArrayList arrayList = this.f8517e;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        this.f8516d.put(view.getId(), view);
        this.k = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f8516d.remove(view.getId());
        d a3 = a(view);
        this.f8518f.f16384d0.remove(a3);
        a3.f16341I = null;
        this.f8517e.remove(view);
        this.k = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.k = true;
        super.requestLayout();
    }

    public void setConstraintSet(p pVar) {
        this.f8523m = pVar;
    }

    @Override // android.view.View
    public void setId(int i4) {
        int id = getId();
        SparseArray sparseArray = this.f8516d;
        sparseArray.remove(id);
        super.setId(i4);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i4) {
        if (i4 == this.j) {
            return;
        }
        this.j = i4;
        requestLayout();
    }

    public void setMaxWidth(int i4) {
        if (i4 == this.f8521i) {
            return;
        }
        this.f8521i = i4;
        requestLayout();
    }

    public void setMinHeight(int i4) {
        if (i4 == this.f8520h) {
            return;
        }
        this.f8520h = i4;
        requestLayout();
    }

    public void setMinWidth(int i4) {
        if (i4 == this.f8519g) {
            return;
        }
        this.f8519g = i4;
        requestLayout();
    }

    public void setOnConstraintsChanged(q qVar) {
        i iVar = this.f8524n;
        if (iVar != null) {
            iVar.getClass();
        }
    }

    public void setOptimizationLevel(int i4) {
        boolean z8;
        this.f8522l = i4;
        this.f8518f.f16395p0 = i4;
        if ((i4 & 256) == 256) {
            z8 = true;
        } else {
            z8 = false;
        }
        C1766e.f16040p = z8;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f8516d = new SparseArray();
        this.f8517e = new ArrayList(4);
        this.f8518f = new e();
        this.f8519g = 0;
        this.f8520h = 0;
        this.f8521i = Integer.MAX_VALUE;
        this.j = Integer.MAX_VALUE;
        this.k = true;
        this.f8522l = 263;
        this.f8523m = null;
        this.f8524n = null;
        this.f8525o = -1;
        this.f8526p = new HashMap();
        this.f8527q = new SparseArray();
        this.f8528r = new f(this);
        b(attributeSet, i4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, A.e] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.f38a = -1;
        marginLayoutParams.f40b = -1;
        marginLayoutParams.f42c = -1.0f;
        marginLayoutParams.f44d = -1;
        marginLayoutParams.f46e = -1;
        marginLayoutParams.f48f = -1;
        marginLayoutParams.f50g = -1;
        marginLayoutParams.f52h = -1;
        marginLayoutParams.f54i = -1;
        marginLayoutParams.j = -1;
        marginLayoutParams.k = -1;
        marginLayoutParams.f57l = -1;
        marginLayoutParams.f58m = -1;
        marginLayoutParams.f59n = 0;
        marginLayoutParams.f60o = 0.0f;
        marginLayoutParams.f61p = -1;
        marginLayoutParams.f62q = -1;
        marginLayoutParams.f63r = -1;
        marginLayoutParams.f64s = -1;
        marginLayoutParams.f65t = -1;
        marginLayoutParams.f66u = -1;
        marginLayoutParams.f67v = -1;
        marginLayoutParams.f68w = -1;
        marginLayoutParams.f69x = -1;
        marginLayoutParams.f70y = -1;
        marginLayoutParams.f71z = 0.5f;
        marginLayoutParams.f14A = 0.5f;
        marginLayoutParams.f15B = null;
        marginLayoutParams.f16C = 1;
        marginLayoutParams.f17D = -1.0f;
        marginLayoutParams.f18E = -1.0f;
        marginLayoutParams.f19F = 0;
        marginLayoutParams.f20G = 0;
        marginLayoutParams.f21H = 0;
        marginLayoutParams.f22I = 0;
        marginLayoutParams.f23J = 0;
        marginLayoutParams.K = 0;
        marginLayoutParams.f24L = 0;
        marginLayoutParams.f25M = 0;
        marginLayoutParams.f26N = 1.0f;
        marginLayoutParams.f27O = 1.0f;
        marginLayoutParams.f28P = -1;
        marginLayoutParams.f29Q = -1;
        marginLayoutParams.f30R = -1;
        marginLayoutParams.f31S = false;
        marginLayoutParams.f32T = false;
        marginLayoutParams.f33U = null;
        marginLayoutParams.f34V = true;
        marginLayoutParams.f35W = true;
        marginLayoutParams.f36X = false;
        marginLayoutParams.Y = false;
        marginLayoutParams.f37Z = false;
        marginLayoutParams.f39a0 = -1;
        marginLayoutParams.f41b0 = -1;
        marginLayoutParams.f43c0 = -1;
        marginLayoutParams.f45d0 = -1;
        marginLayoutParams.f47e0 = -1;
        marginLayoutParams.f49f0 = -1;
        marginLayoutParams.f51g0 = 0.5f;
        marginLayoutParams.f56k0 = new d();
        return marginLayoutParams;
    }
}
