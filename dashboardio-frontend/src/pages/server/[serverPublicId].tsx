import { Layout } from '@/components/Layout';
import Head from 'next/head';
import React from 'react';
import { ReactJSXElement } from '@emotion/react/types/jsx-namespace';

export default function ServerDashboard(): ReactJSXElement {
  return (
    <Layout>
      <Head>
        <title>Dashboardio - Server Dashboard</title>
      </Head>


    </Layout>
  );
}