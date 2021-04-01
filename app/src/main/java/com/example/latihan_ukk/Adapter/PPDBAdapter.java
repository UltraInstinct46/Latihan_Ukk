package com.example.latihan_ukk.Adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.latihan_ukk.Data.PPDB;
import com.example.latihan_ukk.PPDBView;
import com.example.latihan_ukk.R;

import java.util.ArrayList;

public class PPDBAdapter extends RecyclerView.Adapter<PPDBAdapter.CardViewViewHolder> {
    private ArrayList<PPDB> listPPDB;
    private OnItemClickCallback onItemClickCallback;
    void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }
    public PPDBAdapter(ArrayList<PPDB> list){
        this.listPPDB = list;
    }
    @NonNull
    @Override
    public PPDBAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_ppdb_item,parent,false);
        return new CardViewViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {
        final PPDB ppdb = listPPDB.get(position);
        holder.idPPDB = ppdb.getId();
        holder.tvNisPPDB.setText(ppdb.getNis());
//        holder.tvNamaPPDB.setText(ppdb.getNama());
//        holder.tvJkPPDB.setText(ppdb.getJk());
//        holder.tvTempPPDB.setText(ppdb.getTemp());
//        holder.tvTglPPDB.setText(ppdb.getTgl());
//        holder.tvAlamatPPDB.setText(ppdb.getAlamat());
//        holder.tvSekolahPPDB.setText(ppdb.getSekolah());
//        holder.tvKelasPPDB.setText(ppdb.getKelas());
//        holder.tvJurusanPPDB.setText(ppdb.getJurusan());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(v.getContext(), PPDBView.class);
                intent.putExtra(PPDBView.EXTRA_ID_PPDB_VIEW, holder.idPPDB);
                v.getContext().startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return listPPDB.size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        TextView tvNisPPDB,tvNamaPPDB,tvJkPPDB,tvTempPPDB,tvTglPPDB,tvAlamatPPDB,tvSekolahPPDB,tvKelasPPDB,tvJurusanPPDB;
        int idPPDB;
        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNisPPDB = itemView.findViewById(R.id.txt_nis_ppdb);
//            tvNamaPPDB = itemView.findViewById(R.id.txt_nama_ppdb);
//            tvJkPPDB = itemView.findViewById(R.id.txt_jk_ppdb);
//            tvTempPPDB = itemView.findViewById(R.id.txt_temp_ppdb);
//            tvTglPPDB = itemView.findViewById(R.id.txt_tgl_ppdb);
//            tvAlamatPPDB = itemView.findViewById(R.id.txt_alamat_ppdb);
//            tvSekolahPPDB = itemView.findViewById(R.id.txt_sekolah_ppdb);
//            tvKelasPPDB = itemView.findViewById(R.id.txt_kelas_ppdb);
//            tvJurusanPPDB = itemView.findViewById(R.id.txt_jurusan_ppdb);
            idPPDB = 0;
        }
    }
    public interface OnItemClickCallback {
        void onItemClicked(PPDB data);
    }
}
