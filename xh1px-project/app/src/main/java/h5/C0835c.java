package h5;

import a.AbstractC0405a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.buzbuz.smartautoclicker.R;
import e5.AbstractC0645a;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import x5.p;

/* renamed from: h5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0835c {

    /* renamed from: a, reason: collision with root package name */
    public final C0834b f11411a;

    /* renamed from: b, reason: collision with root package name */
    public final C0834b f11412b = new C0834b();

    /* renamed from: c, reason: collision with root package name */
    public final float f11413c;

    /* renamed from: d, reason: collision with root package name */
    public final float f11414d;

    /* renamed from: e, reason: collision with root package name */
    public final float f11415e;

    /* renamed from: f, reason: collision with root package name */
    public final float f11416f;

    /* renamed from: g, reason: collision with root package name */
    public final float f11417g;

    /* renamed from: h, reason: collision with root package name */
    public final float f11418h;

    /* renamed from: i, reason: collision with root package name */
    public final int f11419i;
    public final int j;
    public final int k;

    public C0835c(Context context, C0834b c0834b) {
        C0834b c0834b2;
        AttributeSet attributeSet;
        int i4;
        boolean z8;
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        int intValue5;
        int intValue6;
        int intValue7;
        int intValue8;
        int intValue9;
        int intValue10;
        int intValue11;
        int intValue12;
        int intValue13;
        int intValue14;
        int intValue15;
        int intValue16;
        boolean booleanValue;
        int next;
        if (c0834b == null) {
            c0834b2 = new C0834b();
        } else {
            c0834b2 = c0834b;
        }
        int i8 = c0834b2.f11390d;
        if (i8 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i8);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    if (TextUtils.equals(xml.getName(), "badge")) {
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                        attributeSet = asAttributeSet;
                        i4 = asAttributeSet.getStyleAttribute();
                    } else {
                        throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (IOException | XmlPullParserException e9) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i8));
                notFoundException.initCause(e9);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i4 = 0;
        }
        TypedArray h8 = p.h(context, attributeSet, AbstractC0645a.f10634c, R.attr.badgeStyle, i4 == 0 ? R.style.Widget_MaterialComponents_Badge : i4, new int[0]);
        Resources resources = context.getResources();
        this.f11413c = h8.getDimensionPixelSize(4, -1);
        this.f11419i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f11414d = h8.getDimensionPixelSize(14, -1);
        this.f11415e = h8.getDimension(12, resources.getDimension(R.dimen.m3_badge_size));
        this.f11417g = h8.getDimension(17, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f11416f = h8.getDimension(3, resources.getDimension(R.dimen.m3_badge_size));
        this.f11418h = h8.getDimension(13, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.k = h8.getInt(24, 1);
        C0834b c0834b3 = this.f11412b;
        int i9 = c0834b2.f11396l;
        c0834b3.f11396l = i9 == -2 ? 255 : i9;
        int i10 = c0834b2.f11398n;
        if (i10 != -2) {
            c0834b3.f11398n = i10;
        } else if (h8.hasValue(23)) {
            this.f11412b.f11398n = h8.getInt(23, 0);
        } else {
            this.f11412b.f11398n = -1;
        }
        String str = c0834b2.f11397m;
        if (str != null) {
            this.f11412b.f11397m = str;
        } else if (h8.hasValue(7)) {
            this.f11412b.f11397m = h8.getString(7);
        }
        C0834b c0834b4 = this.f11412b;
        c0834b4.f11402r = c0834b2.f11402r;
        CharSequence charSequence = c0834b2.f11403s;
        c0834b4.f11403s = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        C0834b c0834b5 = this.f11412b;
        int i11 = c0834b2.f11404t;
        c0834b5.f11404t = i11 == 0 ? R.plurals.mtrl_badge_content_description : i11;
        int i12 = c0834b2.f11405u;
        c0834b5.f11405u = i12 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i12;
        Boolean bool = c0834b2.f11407w;
        if (bool != null && !bool.booleanValue()) {
            z8 = false;
        } else {
            z8 = true;
        }
        c0834b5.f11407w = Boolean.valueOf(z8);
        C0834b c0834b6 = this.f11412b;
        int i13 = c0834b2.f11399o;
        c0834b6.f11399o = i13 == -2 ? h8.getInt(21, -2) : i13;
        C0834b c0834b7 = this.f11412b;
        int i14 = c0834b2.f11400p;
        c0834b7.f11400p = i14 == -2 ? h8.getInt(22, -2) : i14;
        C0834b c0834b8 = this.f11412b;
        Integer num = c0834b2.f11394h;
        if (num == null) {
            intValue = h8.getResourceId(5, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full);
        } else {
            intValue = num.intValue();
        }
        c0834b8.f11394h = Integer.valueOf(intValue);
        C0834b c0834b9 = this.f11412b;
        Integer num2 = c0834b2.f11395i;
        if (num2 == null) {
            intValue2 = h8.getResourceId(6, 0);
        } else {
            intValue2 = num2.intValue();
        }
        c0834b9.f11395i = Integer.valueOf(intValue2);
        C0834b c0834b10 = this.f11412b;
        Integer num3 = c0834b2.j;
        if (num3 == null) {
            intValue3 = h8.getResourceId(15, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full);
        } else {
            intValue3 = num3.intValue();
        }
        c0834b10.j = Integer.valueOf(intValue3);
        C0834b c0834b11 = this.f11412b;
        Integer num4 = c0834b2.k;
        if (num4 == null) {
            intValue4 = h8.getResourceId(16, 0);
        } else {
            intValue4 = num4.intValue();
        }
        c0834b11.k = Integer.valueOf(intValue4);
        C0834b c0834b12 = this.f11412b;
        Integer num5 = c0834b2.f11391e;
        if (num5 == null) {
            intValue5 = AbstractC0405a.C(context, h8, 1).getDefaultColor();
        } else {
            intValue5 = num5.intValue();
        }
        c0834b12.f11391e = Integer.valueOf(intValue5);
        C0834b c0834b13 = this.f11412b;
        Integer num6 = c0834b2.f11393g;
        if (num6 == null) {
            intValue6 = h8.getResourceId(8, R.style.TextAppearance_MaterialComponents_Badge);
        } else {
            intValue6 = num6.intValue();
        }
        c0834b13.f11393g = Integer.valueOf(intValue6);
        Integer num7 = c0834b2.f11392f;
        if (num7 != null) {
            this.f11412b.f11392f = num7;
        } else if (h8.hasValue(9)) {
            this.f11412b.f11392f = Integer.valueOf(AbstractC0405a.C(context, h8, 9).getDefaultColor());
        } else {
            int intValue17 = this.f11412b.f11393g.intValue();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(intValue17, AbstractC0645a.f10627Q);
            obtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList C8 = AbstractC0405a.C(context, obtainStyledAttributes, 3);
            AbstractC0405a.C(context, obtainStyledAttributes, 4);
            AbstractC0405a.C(context, obtainStyledAttributes, 5);
            obtainStyledAttributes.getInt(2, 0);
            obtainStyledAttributes.getInt(1, 1);
            int i15 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
            obtainStyledAttributes.getResourceId(i15, 0);
            obtainStyledAttributes.getString(i15);
            obtainStyledAttributes.getBoolean(14, false);
            AbstractC0405a.C(context, obtainStyledAttributes, 6);
            obtainStyledAttributes.getFloat(7, 0.0f);
            obtainStyledAttributes.getFloat(8, 0.0f);
            obtainStyledAttributes.getFloat(9, 0.0f);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(intValue17, AbstractC0645a.f10616E);
            obtainStyledAttributes2.hasValue(0);
            obtainStyledAttributes2.getFloat(0, 0.0f);
            obtainStyledAttributes2.recycle();
            this.f11412b.f11392f = Integer.valueOf(C8.getDefaultColor());
        }
        C0834b c0834b14 = this.f11412b;
        Integer num8 = c0834b2.f11406v;
        if (num8 == null) {
            intValue7 = h8.getInt(2, 8388661);
        } else {
            intValue7 = num8.intValue();
        }
        c0834b14.f11406v = Integer.valueOf(intValue7);
        C0834b c0834b15 = this.f11412b;
        Integer num9 = c0834b2.f11408x;
        if (num9 == null) {
            intValue8 = h8.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding));
        } else {
            intValue8 = num9.intValue();
        }
        c0834b15.f11408x = Integer.valueOf(intValue8);
        C0834b c0834b16 = this.f11412b;
        Integer num10 = c0834b2.f11409y;
        if (num10 == null) {
            intValue9 = h8.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding));
        } else {
            intValue9 = num10.intValue();
        }
        c0834b16.f11409y = Integer.valueOf(intValue9);
        C0834b c0834b17 = this.f11412b;
        Integer num11 = c0834b2.f11410z;
        if (num11 == null) {
            intValue10 = h8.getDimensionPixelOffset(18, 0);
        } else {
            intValue10 = num11.intValue();
        }
        c0834b17.f11410z = Integer.valueOf(intValue10);
        C0834b c0834b18 = this.f11412b;
        Integer num12 = c0834b2.f11383A;
        if (num12 == null) {
            intValue11 = h8.getDimensionPixelOffset(25, 0);
        } else {
            intValue11 = num12.intValue();
        }
        c0834b18.f11383A = Integer.valueOf(intValue11);
        C0834b c0834b19 = this.f11412b;
        Integer num13 = c0834b2.f11384B;
        if (num13 == null) {
            intValue12 = h8.getDimensionPixelOffset(19, c0834b19.f11410z.intValue());
        } else {
            intValue12 = num13.intValue();
        }
        c0834b19.f11384B = Integer.valueOf(intValue12);
        C0834b c0834b20 = this.f11412b;
        Integer num14 = c0834b2.f11385C;
        if (num14 == null) {
            intValue13 = h8.getDimensionPixelOffset(26, c0834b20.f11383A.intValue());
        } else {
            intValue13 = num14.intValue();
        }
        c0834b20.f11385C = Integer.valueOf(intValue13);
        C0834b c0834b21 = this.f11412b;
        Integer num15 = c0834b2.f11388F;
        if (num15 == null) {
            intValue14 = h8.getDimensionPixelOffset(20, 0);
        } else {
            intValue14 = num15.intValue();
        }
        c0834b21.f11388F = Integer.valueOf(intValue14);
        C0834b c0834b22 = this.f11412b;
        Integer num16 = c0834b2.f11386D;
        if (num16 == null) {
            intValue15 = 0;
        } else {
            intValue15 = num16.intValue();
        }
        c0834b22.f11386D = Integer.valueOf(intValue15);
        C0834b c0834b23 = this.f11412b;
        Integer num17 = c0834b2.f11387E;
        if (num17 == null) {
            intValue16 = 0;
        } else {
            intValue16 = num17.intValue();
        }
        c0834b23.f11387E = Integer.valueOf(intValue16);
        C0834b c0834b24 = this.f11412b;
        Boolean bool2 = c0834b2.f11389G;
        if (bool2 == null) {
            booleanValue = h8.getBoolean(0, false);
        } else {
            booleanValue = bool2.booleanValue();
        }
        c0834b24.f11389G = Boolean.valueOf(booleanValue);
        h8.recycle();
        Locale locale = c0834b2.f11401q;
        if (locale == null) {
            this.f11412b.f11401q = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.f11412b.f11401q = locale;
        }
        this.f11411a = c0834b2;
    }
}
